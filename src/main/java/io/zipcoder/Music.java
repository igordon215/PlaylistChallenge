package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int selectUp = 0;
        int selectDown = 0;

        if(startIndex == 0 && this.playList[this.playList.length-1].equals(selection)){
            return 1;
        }
        for (int i = startIndex; i < this.playList.length; i++){
            if(!this.playList[i].equals(selection)) {
                selectDown++;
            } else break;
            //System.out.println(selection);
        }

        for (int i = startIndex; i >= 0; i--){
            if (!this.playList[i].equals(selection)){
                selectUp++;
            } else break;
            //System.out.println(selection);
        }

        if (selectDown < selectUp){
            return selectDown;
        } else return selectUp;

    }

}
