import processing.core.PApplet;

public class Sketch extends PApplet {

  public void settings() {
    size(1200, 600);
  }

  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){

    int intX = 0;
    int intY = 0;

    // Draws a 30x30 grid of white squares
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;

    // Alternates between black and white columns
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 300 + 3 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;
        fill((intRow + 1) % 2 * 255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */
  public void draw_section3(){
    int intX = 0;
    int intY = 0;

    // Alternates between black and white rows
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 600 + 3 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;
        fill(intColumn % 2 * 255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 900 + 3 + intRow * 10;
        intY = 300 + 3 + intColumn * 10;
        fill(0);
        // If the row is divisible by 2 and the column - 1 is divisible by 2 then the squares are white
        if (intRow % 2 == 0 && (intColumn + 1) % 2 == 0) {
          fill(255);
        }
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    // Draws a pyrimid of white squares
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = (30 - intRow - 1); intColumn < 30; intColumn++ ){
        intX = 3 + intRow * 10;
        intY = 3 + intColumn * 10;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    // Draws the same pyrimid but turned the other way
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = intRow; intColumn < 30; intColumn++ ){
        intX = 300 + 3 + intRow * 10;
        intY = 3 + intColumn * 10;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    // Draws upside down pyrimid
    for(int intRow = 0; intRow <= 30; intRow++){
      for(int intColumn = (30 - intRow - 1); intColumn >= 0; intColumn-- ){
        intX = 600 + 3 + intRow * 10;
        intY = 3 + intColumn * 10;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    // Draws upside down pyrimid but facing different way
    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = intRow; intColumn >= 0; intColumn-- ){
        intX = 900 + 3 + intRow * 10;
        intY = 3 + intColumn * 10;
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  }
