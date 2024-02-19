package project.gym.InventoryItemDto;

import lombok.Data;

@Data
public class InventoryItemResponseDto {
	private String itemName;
	private int quantity;
	private String category;
	private String location;
}
