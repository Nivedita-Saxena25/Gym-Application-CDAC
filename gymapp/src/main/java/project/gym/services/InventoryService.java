package project.gym.services;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import project.gym.dao.IInventoryItem;
import project.gym.pojos.InventoryItem;

import java.util.List;

	@Service
	public class InventoryService implements IInventoryService {
		
		@Autowired
	    private final IInventoryItem inventoryDAO;

	    
	    public InventoryService(IInventoryItem inventoryDAO) {
	        this.inventoryDAO = inventoryDAO;
	    }

	    @Override
	    public InventoryItem getItemById(Long itemId) {
	        return inventoryDAO.findById(itemId).orElse(null);
	    }

	    @Override
	    public List<InventoryItem> getAllItems() {
	        return inventoryDAO.findAll();
	    }

	    @Override
	    public InventoryItem saveItem(InventoryItem item) {
	        return inventoryDAO.save(item);
	    }

	    @Override
	    public void deleteItem(Long itemId) {
	        inventoryDAO.deleteById(itemId);
	    }
	}


