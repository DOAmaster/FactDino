package com.doa.factdino;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    TextView mainText;
    private Handler h =new Handler();
    int time_delay = 1000;
    Random r = new Random();
    int randomNum = 0;
    MediaPlayer mp;


    String[] mySadStrings = {
            "Life is fleeting and death is eternal",
            "It’s always worse than it seems",
            "Nothing is ever certain",
            "From the moment we're are born, we begin to die",
            "Death comes to us all; we can only choose how to face it when it comes",
            "A tiny speck of nothing in a sea of emptiness",
            "Every day you wake you are one day closer to death",
            "The only thing certain in this world is death and taxes",
            "What a terrible thing it is to lose one's mind",
            "All that we see or seem is but a dream within a dream",
            "All that is left of our lives is that which is written on our headstones",
            "To perceive is to suffer",
            "Nothing matters very much and most things don't matter at all",
            "Habit: A shackle for the free",
            "Joy came always after pain",
            "Everything in life is luck",
            "Don't try to solve serious matters in the middle of the night",
            "Life may be not only meaningless but absurd",
            "Your words have no weight in this world",
            "In the grand scheme of things, dust is no less significant than you",
            "Everyone you know will eventually be dead",
            "One day your name will be said for the last time",
            "There is no God",
            "Your demise will go largely unnoticed",
            "Your birth was an accident regretted by all who were involved",
            "No afterlife awaits you",
            "Nothing is permanent, everything you know will eventually come to an end",
            "Nothing can escape the cold embrace of undoing",
            "You are not the exception",
            "You have no influence over your future",
            "You have done nothing right",
            "No one's life would be worse without you in it",
            "You are but a placeholder for the person who comes after you",
            "Nothing will make up for the shameful things you have done",
            "Life is utterly and completely meaningless",
            "Every path you choose will lead to equal disappointment",
            "No one is keeping tally of your feeble existence but you",
            "No medicine will cure the sickness that lives within you",
            "True love awaits no one",
            "They only laugh at your jokes out of pity",
            "You will die alone",
            "Let go of the rail, let go of the rail",
            "Your name will be placed on a gravestone and then quickly forgotten"
    };
    String[] myFactStrings = {
            "Cats always land on their feet",
            "Cats can be allergic to people",
            "Sea Otters hold hands when asleep",
            "Maple syrup is sap from the maple tree",
            "There are 206 bones in the human body",
            "The domestic cat is classified as an invasive species",
            "Blog is a portmanteu of the words web and log",
            "The Dead Sea is one of the world's saltiest bodies of water, with 33.7% salinity",
            "Tetris was created by Alexey Pazhitnov on June 6, 1984",
            "The Mississippi River is the largest river system in the United States and the largest of North America",
            "The Declaration of Independance was adopted by the Continental Congress on July 4, 1776",
            "When hippos are upset, their sweat turns red",
            "A flock of crows is known as a murder",
            "A lion’s roar can be heard from 5 miles away",
            "A shrimp's heart is in it's head",
            "Rats and horses can't vomit",
            "In every episode of Seinfeld there is a Superman somewhere",
            "Most lipstick contains fish scales",
            "Hot water is heavier than cold",
            "Sound travels 15 times faster through steel than through the air",
            "Sloths take two weeks to digest their food",
            "Skunks can accurately spray their smelly fluid as far as ten feet",
            "The lifespan of a squirrel is about nine years",
            "Gorillas sleep as much as fourteen hours per day",
            "There are no clocks in Las Vegas gambling casinos",
            "Human thigh bones are stronger than concrete",
            "You can’t kill yourself by holding your breath",
            "Your heart beats over 100,000 times a day",
            "Dolphins sleep with one eye open",
            "A man named Charles Osborne had the hiccups for 69 years",
            "Some lions mate over 50 times a day",
            "Butterflies taste with their feet",
            "A cat's urine glows under a black light",
            "Starfish have no brains",
            "Frogs absorb water through their skin",
            "Otters sleep holding hands",
            "Caterpillars completely liquify as they transform into moths",
            "All of the clocks in the movie \"Pulp Fiction\" are stuck at 4:20",
            "If a male lion takes over a pride, he executes all of the cubs",
            "A hummingbird weighs less than a penny",
            "A shark can detect one part of blood in 100 million parts of water",
            "A jellyfish is 95 percent water",
            "A cockroach can live several weeks with its head cut off",
            "A flea can jump 350 times its body length",
            "An ostrich’s eye is bigger than its brain",
            "Baby robins eat 14 feet of earthworms every day",
            "Dogs are capable of understanding up to 250 words and gestures",
            "The longest jellyfish on record measured 160 feet",
            "Honey does not spoil",
            "Unless food is mixed with saliva you can’t taste it",
            "A female dolphin will assist in the birth of another’s baby dolphin",
            "Your left lung is smaller than your right lung to make room for your heart",
            "Human brain is more active during sleep than during the day",
            "85% of plant life is found in the ocean",
            "Sponges hold more cold water than hot",
            "Hummingbirds are the only bird that can fly backwards",
            "A duck can’t walk without bobbing its head",
            "A strawberry is the only fruit which seeds grow on the outside",
            "An elephants ears are used to regulate body temperature",
            "Reindeer hair is hollow inside like a tube",
            "Your skin is the largest organ making up the human body",
            "Cows don’t have upper front teeth",
            "Your most sensitive finger is your index finger",
            "Flamingos can bend their knees backwards",
            "Gold never erodes",
            "Ants stretch when they wake up in the morning",
            "Oak trees don’t produce acorns until they are 50 years old",
            "The Atlantic Ocean is saltier than the Pacific",
            "Sharks are immune to all known diseases",
            "Carrots contain 0% fat",
            "Horses sleep standing up",
            "Crocodiles are color blind",
            "Crocodiles swallow rocks to help them dive deeper",
            "Grasshoppers have white blood",
            "The most sung song is happy birthday",
            "The bones of a pigeon weigh less than its feathers",
            "The most common disease is tooth decay",
            "Giraffes has the highest blood pressure of any animal",
            "Your right lung takes in more air than your left",
            "Sharks never stop moving even when they sleep or rest",
            "Giant tortoises can live in captivity longer than any other animal",
            "Jellyfish don’t have a brain",
            "A hippopotamus can run faster than a man",
            "Every living thing on the Earth contains carbon",
            "Only pregnant females polar bears hibernate",
            "It takes 17 muscles to smile and 43 to frown",
            "The world’s most expensive spice is saffron",
            "When hydrogen burns in the air, water is formed",
            "Your fingernails grow faster in cold weather",
            "The plastic things on the end of shoelaces are called aglets",
            "Dragonflies have six legs but can’t walk",
            "There’s volcano in Indonesia that spews blue lava",
            "Bubble wrap was originally intended to be used as wallpaper",
            "Blue flames are hotter than red flames",
            "You recall memories better with your eyes closed",
            "Hippopotamus milk is pink",
            "Human eye can distinguish about 10 million different colors",
            "Trees can die from old age",
            "Antarctica is the only continent without reptiles",
            "Some snakes survive for two years without a meal",
            "Some fish, like triggerfish, can swim backwards",
            "The Earth’s core is about as hot as the sun",
            "Beavers have orange teeth",
            "There are about 1 million ants for every person in the world",
            "An octopus has three hearts",
            "Gold has been discovered on every continent on Earth",
            "A jellyfish is approximately 95% water",
            "Your age is the number of times you’ve orbited around the sun",
            "It takes 53 gallons of water to produce a single egg",
            "Sharks return to their own birthplace to give birth",
            "Mushrooms create their own breeze",
            "Ear wax from whales keep record of ocean contaminants",
            "Mosquitoes are the deadliest animals on Earth",
            "A handshake transfers more germs than a kiss",
            "India has more population than the entire western hemisphere",
            "Barbie’s full name is Barbara Millicent Roberts",
            "Male kangaroos flex their biceps to impress females",
            "Everyone has a unique tongue print",
            "Approximately 10 percent of the Earth is covered by glaciers",
            "The chicken is the closest living relative to the Tyrannosaurus Rex",
            "Chickens have over 200 distinct noises they make for communicating",
            "The first bird domesticated by humans was the goose",
            "The Earth’s rotation is gradually slowing",
            "The Earth was once believed to be the center of the universe",
            "Earth is the only planet not named after a god",
            "A person would weigh much less on the Moon",
            "The first spacecraft to reach the Moon was Luna 1 in 1959",
            "The only letter that doesn't appear on the periodic table is J",
            "Helium balloons float because helium is lighter than air",
            "Walnuts are the oldest known tree food",
            "Every cell in the body contains salt",
            "Salt was used to preserve Egyptian mummies",
            "Turtles live on every continent except Antarctica",
            "80% of all the freshwater on earth is frozen as ice or snow",
            "The country with the largest number of WWII causalities was Russia",
            "Eighty percent of Soviet males born in 1923 didn’t survive WWII",
            "The total cost of WWI for the U.S. was more than $30 billion",
            "The United Sates joined WWI during the final year and half of fighting",
            "The first person to look into space with a telescope was Galileo",
            "There is no sound in space",
            "Most of the atoms in our bodies were created in stars through fusion",
            "The average distance between stars is 20 million million miles",
            "There are more than 20 trillion galaxies in our universe",
            "Jupiter weighs more than twice as much as all our other planets together",
            "Earth is the densest planet in the Solar System",
            "There is no solid land under the North Pole, just sea ice",
            "There are nearly 300,000 different species of plants currently living on Earth",
            "There are about 35,429 McDonald’s worldwide",
            "It takes approximately 400 cacao beans to make one pound of chocolate",
            "Rowling is the first person to become a billionaire by writing books",
            "The Latin word for tattoo is stigma",
            "The gluteus maximus is the body’s largest muscle",
            "A human’s ears and nose never stop growing",
            "A human sneeze can travel about 100 mph",
            "Humans spend about five years of their lives eating",
            "heart beats over 3 billion times during an average human lifespan",
            "A row of corn always has an even number",
            "Spiders eat more insects than birds and bats combined",
            "Some tarantulas live more than 20 years",
            "A bat’s echolocation can detect objects as thin as a human hair",
            "No vampire bats live in the U.S. except in zoos",
            "Bears live as long as 30 years in the wild",
            "Bears can see in color",
            "A polar bear’s stomach can hold 150 lbs of meat",
            "A polar bear can swim up to 100 miles without resting",
            "Sloth bears are the only bears that are more active at night",
            "Cats make about 100 different sounds. Dogs make only about 10",
            "Every year, nearly four million cats are eaten in Asia",
            "A cat can jump up to five times its own height",
            "A cat usually has about 12 whiskers on each side of its face"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup(savedInstanceState);

        mp = MediaPlayer.create(this, R.raw.music);
        mp.setLooping(true);
        mp.start();

        h.postDelayed(myRunnable, 7000); // 1000 one second in ms

    }
    protected void setup(Bundle savedInstanceState) {

        //gets the mainFact textview frm the main activity
        mainText = (TextView) findViewById(R.id.mainFact);

        //sets up custom font from asset folder
        final Typeface mtypeFace = Typeface.createFromAsset(getAssets(),
                "fonts/dino.ttf");

    }

    Handler myHandler = new Handler();
    final Runnable myRunnable = new Runnable() {

        @Override
        public void run() {
            mainText.setTextSize(25);
            mainText.setText(genFact());
            myHandler.postDelayed(this, 3000); //ms
        }
    };

    private String genFact (){

        String temp;
        randomNum = r.nextInt(3);

        if(randomNum == 1 || randomNum == 2){
            randomNum = r.nextInt(myFactStrings.length);
            temp = myFactStrings[randomNum];
            return temp;
        }
        if(randomNum == 0){
            randomNum = r.nextInt(mySadStrings.length);
            temp = mySadStrings[randomNum];
            return temp;
        }
        return "nothing";
    }

    private void stopPlaying() {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopPlaying();

        super.onPause();

    }



}
