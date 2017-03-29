package jaco.controllers;

import jaco.models.Album;
import jaco.models.Item;
import jaco.models.ItemRepository;
import jaco.models.Movie;
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
    public Item setItemA(String name, int price, String artist) {
        Album item = new Album();
        item.setMame(name);
        item.setPrice(price);
        item.setArtist(artist);
        itemRepository.save(item);
        return item;
    }

    @RequestMapping("/item/m") @ResponseBody
    public Item setItemM(String name, int price, String actor, String director) {
        Movie item = new Movie();
        item.setMame(name);
        item.setPrice(price);
        item.setActor(actor);
        item.setDirector(director);
        itemRepository.save(item);
        return item;
    }


}
