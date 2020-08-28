package com.company827.enumTT;

//自定义枚举类
public enum Season1 implements Info {
    SPRING("spring","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里？");
        }
    },
    SUMMER("summer","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("生如夏花");
        }
    },
    AUTUMN("autumn","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天是用来分手的季节");
        }
    },
    WINTER("winter","白雪皑皑"){
        @Override
        public void show() {
            System.out.println("冬天里的一把火");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    private Season1(String seasonName, String seasonDesc){
        this.seasonDesc=seasonDesc;
        this.seasonName=seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
          "seasonName='" + seasonName + '\'' +
          ", seasonDesc='" + seasonDesc + '\'' +
          '}';
    }

//    @Override
//    public void show() {
//
//    }

}

