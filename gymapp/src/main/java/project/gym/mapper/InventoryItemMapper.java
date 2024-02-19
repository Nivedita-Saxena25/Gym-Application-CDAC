package project.gym.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;

import project.gym.InventoryItemDto.InventoryItemResponseDto;
import project.gym.customException.InvalidRegistrationException;
import project.gym.pojos.InventoryItem;

public class InventoryItemMapper {

	public static InventoryItem dtoToEntity(InventoryItemResponseDto responseDto) {
		if (responseDto == null) {
			throw new InvalidRegistrationException("Invalid inventory item DTO: InventoryItemRequestDto is null");
		}

		// Validate required fields
		if (StringUtils.isEmpty(responseDto.getItemName()) || StringUtils.isEmpty(responseDto.getCategory())
				|| StringUtils.isEmpty(responseDto.getLocation())) {
			throw new InvalidRegistrationException("Invalid inventory item DTO: Missing required fields");
		}

		InventoryItem inventoryItem = new InventoryItem();

		// Set inventory item details from InventoryItemRequestDto
		inventoryItem.setItemName(responseDto.getItemName());
		inventoryItem.setQuantity(responseDto.getQuantity());
		inventoryItem.setCategory(responseDto.getCategory());
		inventoryItem.setLocation(responseDto.getLocation());

		return inventoryItem;
	}

	public static InventoryItemResponseDto entityToResponseDto(InventoryItem entity) {
		if (entity == null) {
			throw new IllegalArgumentException("InventoryItem entity cannot be null");
		}

		InventoryItemResponseDto responseDto = new InventoryItemResponseDto();

		// Map entity fields to response DTO

		responseDto.setItemName(entity.getItemName());
		responseDto.setQuantity(entity.getQuantity());
		responseDto.setCategory(entity.getCategory());
		responseDto.setLocation(entity.getLocation());

		return responseDto;
	}

	public static List<InventoryItemResponseDto> entityListToResponseDtoList(List<InventoryItem> entities) {
		return entities.stream().map(InventoryItemMapper::entityToResponseDto).collect(Collectors.toList());
	}
}
