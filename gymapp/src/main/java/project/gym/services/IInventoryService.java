package project.gym.services;

import java.util.List;

import project.gym.pojos.InventoryItem;

public interface IInventoryService {
	InventoryItem getItemById(Long itemId);

    List<InventoryItem> getAllItems();

    InventoryItem saveItem(InventoryItem item);

    void deleteItem(Long itemId);

}
