package assetcrudapp.controller;



import assetcrudapp.dao.AssetDao;
import assetcrudapp.model.Asset;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;


@Controller
public class MainController {
	
	@Autowired
	private AssetDao assetDao;
	
	@RequestMapping("/")
	public String home(Model m) {
		
		List<Asset> assets= assetDao.getAssets();
		m.addAttribute("assets",assets);
		
		return "index";
	}
	
	//show add asset form
	@RequestMapping("/add-asset")
	public String addAsset(Model m) {
		m.addAttribute("","Add Asset");
		return "add_product_form";
	}
	
	//handle add asset form
	
	@RequestMapping(value="/handle-asset",method= RequestMethod.POST)
	@Transactional
	public RedirectView handleAsset(@ModelAttribute Asset asset,HttpServletRequest request) {
		System.out.println(asset);
		assetDao.createAsset(asset);
		RedirectView redirectView= new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	//delete handler
	@RequestMapping("/delete/{assetId}")
	public RedirectView deleteAsset(@PathVariable("assetId")int assetId,HttpServletRequest request)
	{
		this.assetDao.deleteAsset(assetId);
		RedirectView redirectView= new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
		
	}
	
	@RequestMapping("/update/{assetId}")
	public String updateForm(@PathVariable("assetId")int assetId,Model m)
	{
		
		Asset asset=this.assetDao.getAsset(assetId);
		m.addAttribute("asset",asset);
		return "update_form";
	}
}

