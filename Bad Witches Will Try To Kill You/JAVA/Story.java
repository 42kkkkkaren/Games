package com.example.adventuregameinjava;

import android.view.View;

public class Story {

        GameScreen gs;
        String nextPosition1, nextPosition2, nextPosition3, nextPosition4;
        boolean bookKnowledge = false;
        boolean killedDragon = false;
        public Story(GameScreen gs){
            this.gs = gs;
        }

        public void selectPosition(String position){
            switch (position){
                case "startingPoint": startingPoint(); break;
                case "sign": sign(); break;
                case "bottle": bottle(); break;
                case "dragon": dragon(); break;
                case "book": book(); break;
                case "witch": witch(); break;
                case "attack": attack(); break;
                case "dead": dead(); break;
                case "goTitleScreen": gs.goTitleScreen(); break;
            }
        }

        public void showAllButtons(){
            //Sign makes button2, 3 and 4 invisible, so you have to make it visible again.
            gs.button1.setVisibility(View.VISIBLE);
            gs.button2.setVisibility(View.VISIBLE);
            gs.button3.setVisibility(View.VISIBLE);
            gs.button4.setVisibility(View.VISIBLE);
        }

        public void startingPoint(){
            gs.image.setImageResource(R.drawable.road);
            gs.text.setText("You are on your way through the mountains. You realize that there are several paths ahead. You need to decide which one to follow. And... Oh! A tiny little Sign! \n\nWhat will you do?");

            gs.button1.setText("Go north");
            gs.button2.setText("Go east");
            gs.button3.setText("Go west");
            gs.button4.setText("Read the Sign");

            showAllButtons();

            nextPosition1 = "witch";
            nextPosition2 = "book";
            nextPosition3 = "bottle";
            nextPosition4 = "sign";
        }
        public void sign(){
            gs.image.setImageResource(R.drawable.sign);
            gs.text.setText("The sign says: \n\nBAD WITCH AHEAD!");

            gs.button1.setText("Back");
            gs.button2.setText("");
            gs.button3.setText("");
            gs.button4.setText("");
            gs.button2.setVisibility(View.INVISIBLE);
            gs.button3.setVisibility(View.INVISIBLE);
            gs.button4.setVisibility(View.INVISIBLE);


            nextPosition1 = "startingPoint";
            nextPosition2 = "";
            nextPosition3 = "";
            nextPosition4 = "";
        }

        public void bottle(){
            gs.image.setImageResource(R.drawable.bottle);
            gs.text.setText("You've found a creature trapped in a jar.");

            gs.button1.setText("Set it free!");
            gs.button2.setText("Go Back.");
            gs.button3.setText("");
            gs.button4.setText("");
            gs.button3.setVisibility(View.INVISIBLE);
            gs.button4.setVisibility(View.INVISIBLE);

            nextPosition1 = "dragon";
            nextPosition2 = "startingPoint";
            nextPosition3 = "";
            nextPosition4 = "";
        }

        public void dragon(){
            if(bookKnowledge == false){
                gs.image.setImageResource(R.drawable.dragon);
                gs.text.setText("It was the spirit of a dragon, and now he's free. And angry. So he let go of his flames and killed you...");

                gs.button1.setText(">");
                gs.button2.setText("");
                gs.button3.setText("");
                gs.button4.setText("");
                gs.button2.setVisibility(View.INVISIBLE);
                gs.button3.setVisibility(View.INVISIBLE);
                gs.button4.setVisibility(View.INVISIBLE);

                nextPosition1 = "dead";
                nextPosition2 = "";
                nextPosition3 = "";
                nextPosition4 = "";
            }else{
                gs.image.setImageResource(R.drawable.dragon);
                gs.text.setText("(You've read an incantation in the book that imprisons creatures in jars.)\n\nYou've beaten the dragon!");

                killedDragon = true;

                gs.button1.setText(">");
                gs.button2.setText("");
                gs.button3.setText("");
                gs.button4.setText("");
                gs.button2.setVisibility(View.INVISIBLE);
                gs.button3.setVisibility(View.INVISIBLE);
                gs.button4.setVisibility(View.INVISIBLE);

                nextPosition1 = "startingPoint";
                nextPosition2 = "";
                nextPosition3 = "";
                nextPosition4 = "";
            }
        }


        public void book(){
            gs.image.setImageResource(R.drawable.book);
            gs.text.setText("Amazing! You've found the Book of All Knowledge.\n“Knowledge is power, France is bacon.“\n\n(You have the Book of All Knowledge now)");

            bookKnowledge = true;

            gs.button1.setText("Back");
            gs.button2.setText("");
            gs.button3.setText("");
            gs.button4.setText("");
            gs.button2.setVisibility(View.INVISIBLE);
            gs.button3.setVisibility(View.INVISIBLE);
            gs.button4.setVisibility(View.INVISIBLE);

            nextPosition1 = "startingPoint";
            nextPosition2 = "";
            nextPosition3 = "";
            nextPosition4 = "";
        }

        public void witch(){
            gs.image.setImageResource(R.drawable.witch);
            gs.text.setText("You encounter a Witch!!!");

            gs.button1.setText("Attack");
            gs.button2.setText("Run");
            gs.button3.setText("");
            gs.button4.setText("");
            gs.button3.setVisibility(View.INVISIBLE);
            gs.button4.setVisibility(View.INVISIBLE);

            nextPosition1 = "attack";
            nextPosition2 = "startingPoint";
            nextPosition3 = "";
            nextPosition4 = "";
        }

        public void attack(){
            if (bookKnowledge == true && killedDragon == true){
                gs.image.setImageResource(R.drawable.broom);
                gs.text.setText("With the Book of All Knowledge and the experience in the mountain forest, you have now conquered a broom!\nAnd proved yourself to be the greatest of witches! Who will be able to defeat you?! \nTHE END!");

                gs.button1.setText("Go to title screen");
                gs.button2.setText("");
                gs.button3.setText("");
                gs.button4.setText("");
                gs.button2.setVisibility(View.INVISIBLE);
                gs.button3.setVisibility(View.INVISIBLE);
                gs.button4.setVisibility(View.INVISIBLE);

                nextPosition1 = "goTitleScreen";
                nextPosition2 = "";
                nextPosition3 = "";
                nextPosition4 = "";
            }else{
                gs.image.setImageResource(R.drawable.witch);
                gs.text.setText("It was a great fight, but the witch of witches is always the best!\n\n(would you rather have turned into a frog?!)");

                gs.button1.setText(">");
                gs.button2.setText("");
                gs.button3.setText("");
                gs.button4.setText("");
                gs.button2.setVisibility(View.INVISIBLE);
                gs.button3.setVisibility(View.INVISIBLE);
                gs.button4.setVisibility(View.INVISIBLE);

                nextPosition1 = "dead";
                nextPosition2 = "";
                nextPosition3 = "";
                nextPosition4 = "";
            }
        }

        public void dead(){
            gs.image.setImageResource(R.drawable.grave);
            gs.text.setText("Oh, no! You are dead. Your adventure ends here.\n\nGAME OVER!");

            gs.button1.setText("Go to the title screen");
            gs.button2.setText("");
            gs.button3.setText("");
            gs.button4.setText("");
            gs.button2.setVisibility(View.INVISIBLE);
            gs.button3.setVisibility(View.INVISIBLE);
            gs.button4.setVisibility(View.INVISIBLE);

            nextPosition1 = "goTitleScreen";
            nextPosition2 = "";
            nextPosition3 = "";
            nextPosition4 = "";
        }
}
