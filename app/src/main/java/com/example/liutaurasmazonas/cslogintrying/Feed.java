//package com.example.liutaurasmazonas.cslogintrying;
//
//
//import java.util.List;
//
//@Root(name = "channel",strict = false)
//class Feed {
//    @Element(name = "channel")
//    Channel channel;
//
//    public Feed() {
//    }
//    @Root(name = "channel",strict = false)
//    public static class Channel{
//        @Element(name = "title", required = false)
//        private String title;
//        @Element(name = "lastBuildDate", required = false)
//        private String buildDate;
//        @ElementList(inline = true)
//        List<Item> items;
//
//        public Channel() {
//        }
//    }
//    @Root(name = "item", strict = false)
//    public static class Item {
//        public Item() {
//        }
//
//        @Element(name = "title")
//        String title;
//        @Element(name = "pubDate")
//        private String pubDate;
//
//        @Override
//        public String toString() {
//            return title;
//        }
//    }
//}