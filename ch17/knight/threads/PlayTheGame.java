//package gr.aueb.cf.ch17.knight.threads;
//
//public class PlayTheGame {
//
//    public static void main(String[] args) {
//        IKnight joa = new Knight();
//        IKnight saintGeorge = new Knight();
//
////        joa.embarkOnMission(new IMission() {
////            @Override
////            public void embark() {
////                System.out.println("Save the Princess");
////            }
////        });
////
////        saintGeorge.embarkOnMission(new IMission() {
////            @Override
////            public void embark() {
////                killTheDragon();
////            }
////        });
////    }
//
////        joa.embarkOnMission(() -> System.out.println("Save the Princess"));  // Lamda expression
////        saintGeorge.embarkOnMission(() -> killTheDragon());
//
//        joa.embarkOnMission(PlayTheGame::saveThePrincess);
//        saintGeorge.embarkOnMission(PlayTheGame::killTheDragon);
//    }
//
//    public static void saveThePrincess() {
//        System.out.println("Save the Princess!");
//    }
//    public static void killTheDragon() {
//        System.out.println("Kill the Dragon");
//    }
//}
