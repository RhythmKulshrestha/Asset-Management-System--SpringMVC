package assetcrudapp.dao;

import org.springframework.stereotype.Component;

import assetcrudapp.model.Asset;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Component
public class AssetDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createAsset(Asset asset) {
	    try {
	        this.hibernateTemplate.saveOrUpdate(asset);
	        this.hibernateTemplate.flush(); // Explicitly flush the session
	    } catch (Exception e) {
	        e.printStackTrace(); // Log or print the exception details
	    }
	}

	
	//get all products
	public List<Asset> getAssets(){
		List<Asset> assets=this.hibernateTemplate.loadAll(Asset.class);
		return assets;
	}
	
	//delete single product
	@Transactional
	public void deleteAsset(int aId) {
		Asset a=this.hibernateTemplate.load(Asset.class, aId);
		this.hibernateTemplate.delete(a);
		
	}
	
	//get single product
	public Asset getAsset(int aId)
	{
		return this.hibernateTemplate.get(Asset.class, aId);
		
	}
	
}
