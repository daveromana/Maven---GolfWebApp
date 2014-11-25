/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcapp.tjpgolfappfinalBeans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
/**
 *
 * @author Travis
 */

 
@Named
public class ImagesView {
    
      private List<String> images;
      private List<String> imagesGallery;
      
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 4; i++) {
            images.add("hills" + i + ".jpg");
        }
        imagesGallery = new ArrayList<String>();
        for (int i = 1; i <= 8; i++) {
            imagesGallery.add("banner_" + i + ".jpg");
        }
    }
 
    public List<String> getImages() {
        return images;
    }

    public List<String> getImagesGallery() {
        return imagesGallery;
    }
    
    
}
