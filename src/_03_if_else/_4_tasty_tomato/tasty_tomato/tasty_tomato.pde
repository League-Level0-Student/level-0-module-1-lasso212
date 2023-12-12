void setup() {
    size(500, 500);
 background(200,0, 0);
    noStroke();
    fill(46,29,29);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(217, 229, 83);
    rect(176, 103, 12, 32);}
void draw() {
    

if(mousePressed){               //if the mouse is pressed 
            fill(200, 0, 0); 
ellipse(mouseX, mouseY, 500, 1);
}}
