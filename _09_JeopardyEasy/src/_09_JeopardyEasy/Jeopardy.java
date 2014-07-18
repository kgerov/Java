package _09_JeopardyEasy;

import java.awt.*;

public class Jeopardy extends EasyApp
{
   public static void main(String[] args)
   {  new Jeopardy(); }
   
   Label lJeopardy = addLabel("Bio Jeopardy",200,30,400,60,this);
   
   Label lScore = addLabel("Money",20,125,50,30,this);
   TextField tScore = addTextField("0.0",70,125,80,30,this);

   Button bCalvin = addButton("Calvin Cycle",20,200,150,50,this);
   Button bLight = addButton("Light-Indep. CR",170,200,150,50,this);
   Button bKreb = addButton("Krebs Cycle",320,200,150,50,this);
   Button bGlucose = addButton("Glycolysis",470,200,150,50,this);
   
   Button bLight2 = addButton("Light-Indep. 200",170,284,150,50,this);
   Button bKreb2 = addButton("Krebs 200",320,284,150,50,this);
   Button bGlucose2 = addButton("Glycolysis 200",470,284,150,50,this);
   Button bCalvin2 = addButton("Calvin 200",20,284,150,50,this);
   
   Button bLight3 = addButton("Light-Indep. 300",170,368,150,50,this);
   Button bKreb3 = addButton("Krebs 300",320,368,150,50,this);
   Button bGlucose3 = addButton("Glycolysis 300",470,368,150,50,this);
   Button bCalvin3 = addButton("Calvin 300",20,368,150,50,this);
   
   Button bLight4 = addButton("Light-Indep. 400",170,450,150,50,this);
   Button bKreb4 = addButton("Krebs 400",320,450,150,50,this);
   Button bGlucose4 = addButton("Glycolysis 400",470,450,150,50,this);
   Button bCalvin4 = addButton("Calvin 400",20,450,150,50,this);
   
   Button bPlayAgain = addButton("Play again",100,550,400,50,this);
   
   double score = 0;

   public Jeopardy()
   {
      setSize(650,650);
      setTitle("Photosynthesis Jeopardy");
      lJeopardy.setFont(new Font("Arial",1,36));
      lJeopardy.setBackground(new Color(124,242,145));
      lJeopardy.setForeground(Color.blue);
      lScore.setBackground(new Color(124,242,145));
      setBackground(new Color(124,242,145));
      bCalvin.setFont(new Font("Arial",1,16));
      bLight.setFont(new Font("Arial",1,16));      
      bKreb.setFont(new Font("Arial",1,16));      
      bGlucose.setFont(new Font("Arial",1,16));  
      bCalvin2.setFont(new Font("Arial",1,16));
      bKreb2.setFont(new Font("Arial",1,16));      
      bGlucose2.setFont(new Font("Arial",1,16)); 
      bLight2.setFont(new Font("Arial",1,16));
      bCalvin3.setFont(new Font("Arial",1,16));
      bLight3.setFont(new Font("Arial",1,16));      
      bKreb3.setFont(new Font("Arial",1,16));      
      bGlucose3.setFont(new Font("Arial",1,16)); 
      bCalvin4.setFont(new Font("Arial",1,16));
      bLight4.setFont(new Font("Arial",1,16));      
      bKreb4.setFont(new Font("Arial",1,16));      
      bGlucose4.setFont(new Font("Arial",1,16)); 
      bPlayAgain.setFont(new Font("Arial",1,16));      
      
   }
   
   public void actions(Object source,String command)
   {
      if (source == bCalvin)
      {   calvin(); }
      if (source == bLight)
      {  light();   }
      if (source == bKreb)
      {  kreb();  }
      if (source == bGlucose)
      {  glucose();  }
      if (source == bLight2)
      {  light2(); }
      if (source == bCalvin2)
      {   calvin2(); }
      if (source == bKreb2)
      {  kreb2();  }
      if (source == bGlucose2)
      {  glucose2();  }
      if (source == bCalvin3)
      {   calvin3(); }
      if (source == bLight3)
      {  light3();   }
      if (source == bKreb3)
      {  kreb3();  }
      if (source == bGlucose3)
      {  glucose3();  }
      if (source == bCalvin4)
      {   calvin4(); }
      if (source == bLight4)
      {  light4();   }
      if (source == bKreb4)
      {  kreb4();  }
      if (source == bGlucose4)
      {  glucose4();  }
      if (source == bPlayAgain)
      {  
    	 bCalvin.setEnabled(true);
    	 bLight.setEnabled(true);
         bKreb.setEnabled(true);
         bGlucose.setEnabled(true);
         bCalvin2.setEnabled(true);
    	 bLight2.setEnabled(true);
         bKreb2.setEnabled(true);
         bGlucose2.setEnabled(true);
         bCalvin3.setEnabled(true);
    	 bLight3.setEnabled(true);
         bKreb3.setEnabled(true);
         bGlucose3.setEnabled(true);
         bCalvin4.setEnabled(true);
    	 bLight4.setEnabled(true);
         bKreb4.setEnabled(true);
         bGlucose4.setEnabled(true);
         score = 0;
      }   
      tScore.setText(score + "");
   }
   
   public void calvin()
   {
      int guess = inputInt("The number of CO2 molecules needed to produce one G3P molecule?");
      if (guess == 3)
      {
         score = score + 100;
         output("Good Job!");  
      }
      else
      {  
         score = score - 100;         
         output("Wrong ):" ); 
      }      

      bCalvin.setEnabled(false);
   }
   
   public void light()
   {
      String guess = inputString("______ energy is used to convert ADP to ATP");
      if (
          guess.equalsIgnoreCase("light") 
          || guess.equalsIgnoreCase("Light")
         ) 
      {
         score = score + 100;
         output("Good Job!");  
      }

      else
      {  
         score = score - 100;         
         output("Wrong ):"); 
      }      
      bLight.setEnabled(false);
   }

   public void kreb()
   {
	  String guess = inputString("What is the by-product of the Krebs cycle?");
      if ( guess.equals("CO2") 
    		  || guess.equalsIgnoreCase("co") 
    		  || guess.equalsIgnoreCase("co2")  
    		  || guess.equalsIgnoreCase("CO"))
	      
      {
         score = score + 100;
         output("Good Job!");  
      }
      else
      {  
         score = score - 100;         
         output("Wrong... "); 
      }      
      bKreb.setEnabled(false);
   }
   
   public void glucose()
   {
      String guess = inputString("Name one advantage of glycolysis?");
      if (guess.equals("speed") ||
    		  guess.equalsIgnoreCase("fast") ||
    		  guess.equalsIgnoreCase("anaerobic"))
      {
         score = score + 100;
         output("Good Job!");  
      }
      else
      {  
         score = score - 100;         
         output("Wrong ):"); 
      }      
      bGlucose.setEnabled(false);
   }
   
   public void light2()
   {
      String guess = inputString("________ flow across thylakoid through ATP Synthase");
      if ( guess.equals("protons"))
      {
         score = score + 200;
         output("Good Job!");  
      }
      else
      {  
         score = score - 200;         
         output("Wrong ):" ); 
      }      
      bLight2.setEnabled(false);
   }
   
   public void calvin2()
   {
      String guess = inputString("The third stage is?");
      if ( guess.equals("Regeneration of RuBP") 
    		  || guess.equalsIgnoreCase("Regeneration") 
    		  || guess.equalsIgnoreCase("Regeneration of rubp")  
    		  || guess.equalsIgnoreCase("Regeneration of Rubp") 
    		  || guess.equalsIgnoreCase("regeneration") )
      {
         score = score + 200;
         output("Right!");  
      }
      else
      {  
         score = score - 200;         
         output("Wrong ):" ); 
      }      
      bCalvin2.setEnabled(false);
   }
   
   public void glucose2()
   {
      String guess = inputString("Where does this reaction occur?");
      if ( guess.equals("cytoplasm"))
      {
         score = score + 200;
         output("Right!");  
      }
      else
      {  
         score = score - 200;         
         output("Wrong ):" ); 
      }      
      bGlucose2.setEnabled(false);
   }
   
   public void kreb2()
   {
	  String guess = inputString("What is the other name of the krebs cycle?");
      if ( guess.equals("citric acid cycle") ||
    		  guess.equalsIgnoreCase("Citric Acid Cycle") ||
    		  guess.equalsIgnoreCase("Citric acid cycle"))
      {
         score = score + 200;
         output("Right!");  
      }
      else
      {  
         score = score - 200;         
         output("Wrong ):" ); 
      }      
      bKreb2.setEnabled(false);
   }
   
   public void calvin3()
   {
      String guess = inputString("CO2 is _______ to make sugars");
      if (guess.equals("reduced"))
      {
         score = score + 300;
         output("Good Job!");  
      }
      else
      {  
         score = score - 300;         
         output("Wrong ):" ); 
      }      

      bCalvin3.setEnabled(false);
   }
   
   public void light3()
   {
      String guess = inputString("Energized electrons are transferred from P680 to __________");
      if (
          guess.equalsIgnoreCase("primary acceptor") 
         )   
      {
         score = score + 300;
         output("Good Job!");  
      }

      else
      {  
         score = score - 300;         
         output("Wrong ):"); 
      }      
      bLight3.setEnabled(false);
   }

   public void kreb3()
   {
	   String guess = inputString("Acetyl-CoA combines with a _________ to enter the Krebs cycle and forms citric acid");
	      if (guess.equals("4-C compound") ||
	    		  guess.equalsIgnoreCase("4C compound") ||
	    		  guess.equalsIgnoreCase("4c compund") || 
	    		  guess.equalsIgnoreCase("4-C Compound") || 
	    		  guess.equalsIgnoreCase("4-C compound") ||
	    		  guess.equalsIgnoreCase("4C Compound") ||
	    		  guess.equalsIgnoreCase("4c Compound") || 
	    		  guess.equalsIgnoreCase("4C") )
	      {
         score = score + 300;
         output("Good Job!");  
      }
      else
      {  
         score = score - 300;         
         output("Wrong... "); 
      }      
      bKreb3.setEnabled(false);
   }
   
   public void glucose3()
   {
      String guess = inputString("What are the reactants of the reaction? (Seperate them by space)");
      guess = guess.toLowerCase();
      if (guess.equals("glucose atp") ||
    		  guess.equalsIgnoreCase("atp glucose") ||
    		  guess.equalsIgnoreCase("2 atp glucose") || 
    		  guess.equalsIgnoreCase("glucose 2 atp"))
      {
         score = score + 300;
         output("Good Job!");  
      }
      else
      {  
         score = score - 300;         
         output("Wrong ):"); 
      }      
      bGlucose3.setEnabled(false);
   }
   
   public void calvin4()
   {
      String guess = inputString("Rubisco is a/an ____________?");
      if (guess.equals("enzyme"))
      {
         score = score + 400;
         output("Good Job!");  
      }
      else
      {  
         score = score - 400;         
         output("Wrong ):" ); 
      }      

      bCalvin4.setEnabled(false);
   }
   
   public void light4()
   {
      String guess = inputString("After which photosystem are protons pumped in?");
      if (
          guess.equalsIgnoreCase("PSII") 
          || guess.equalsIgnoreCase("II")
          || guess.equalsIgnoreCase("2")
         )  
      {
         score = score + 400;
         output("Good Job!");  
      }

      else
      {  
         score = score - 400;         
         output("Wrong ):"); 
      }      
      bLight4.setEnabled(false);
   }

   public void kreb4()
   {
      String guess = inputString("Pyruvic acid becomes _________");
      if (guess.equals("acetyl-CoA") ||
    		  guess.equalsIgnoreCase("acetyl-coa") ||
    		  guess.equalsIgnoreCase("acetyl CoA") ||
    		  guess.equalsIgnoreCase("acetyl coa") ||
    		  guess.equalsIgnoreCase("Acetyl-CoA") ||
    		  guess.equalsIgnoreCase("Acetyl CoA") ||
    		  guess.equalsIgnoreCase("acetyl Coa"))
      {
         score = score + 400;
         output("Good Job!");  
      }
      else
      {  
         score = score - 400;         
         output("Wrong... "); 
      }      
      bKreb4.setEnabled(false);
   }
   
   public void glucose4()
   {
      String guess = inputString("Glucose is first broken to ___________ before it becomes 3-C pyruvic acid");
      if (guess.equals("G3P") || 
    		  guess.equalsIgnoreCase("g3p"))
      {
         score = score + 400;
         output("Good Job!");  
      }
      else
      {  
         score = score - 400;         
         output("Wrong ):"); 
      }      
      bGlucose4.setEnabled(false);
   }
}
