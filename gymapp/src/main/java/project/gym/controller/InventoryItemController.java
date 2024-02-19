package project.gym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import project.gym.InventoryItemDto.InventoryItemResponseDto;
import project.gym.mapper.InventoryItemMapper;
import project.gym.pojos.InventoryItem;
import project.gym.services.IInventoryService;

@Controller("/inventory")
public class InventoryItemController {
	@Autowired
	private IInventoryService iInventoryService;

	@PostMapping
	public ResponseEntity<String> addInventory(@RequestBody InventoryItem inventoryItem) {

		iInventoryService.saveItem(inventoryItem);
		return new ResponseEntity<>("Item Add successfully", HttpStatus.OK);
	}

	@GetMapping
	public List<InventoryItemResponseDto> getAllItems() {
		List<InventoryItem> items = iInventoryService.getAllItems();
		return InventoryItemMapper.entityListToResponseDtoList(items);
	}

	@PutMapping("/{id}")
	public ResponseEntity<InventoryItemResponseDto> updateItemsById(@PathVariable Long id,
			@RequestBody InventoryItemResponseDto inventoryItemResponseDto) {
		try {
			InventoryItem updatedItems = iInventoryService.updateItem(id,
					InventoryItemMapper.dtoToEntity(inventoryItemResponseDto));
			return ResponseEntity.ok(InventoryItemMapper.entityToResponseDto(updatedItems));
		} catch (Exception e) {
			// Handle exception properly
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/byid/{id}")
	public ResponseEntity<InventoryItemResponseDto> getItemById(@PathVariable Long id) {
		try {
			InventoryItem items = iInventoryService.getItemById(id);
			return ResponseEntity.ok(InventoryItemMapper.entityToResponseDto(items));
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/byid/{id}")
	public ResponseEntity<String> deleteItem(@PathVariable Long id) {
		try {
			String result = iInventoryService.deleteItem(id);
			return ResponseEntity.ok(result);
		} catch (Exception e) {
			// Handle exception properly
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
