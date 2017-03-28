package netgloo.controllers;

import netgloo.models.Album;
import netgloo.models.Item;
import netgloo.models.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017-03-29.
 */
@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @RequestMapping("/item") @ResponseBody
    public Item getItem(long id) {
        Item item = itemRepository.findById(id);
        System.out.println(item.getMame());
        return item;
    }

    @RequestMapping("/item/a") @ResponseBody
    public Item setItem(String name, int price, String artist) {
        Album item = new Album();
        item.setMame(name);
        item.setPrice(price);
        item.setArtist(artist);
        itemRepository.save(item);
        return item;
    }


}
