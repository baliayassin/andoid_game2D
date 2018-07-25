package com.shenkar.balia.myapplication;

import android.graphics.Canvas;
import android.view.MotionEvent;

import java.util.ArrayList;

public class sceneManager  {

  private ArrayList<scene> scenes = new ArrayList<>();
  public static int ACTIVE_SCENE;

  public sceneManager(){

      ACTIVE_SCENE= 0 ;
    scenes.add(new gamePlayScene());
  }

  public void recieveTouch(MotionEvent event){

      scenes.get(ACTIVE_SCENE).recieveTouch(event);

  }

  public void update(){
scenes.get(ACTIVE_SCENE).update();

  }

  public void draw(Canvas canvas){

      scenes.get(ACTIVE_SCENE).draw(canvas);
  }


}
