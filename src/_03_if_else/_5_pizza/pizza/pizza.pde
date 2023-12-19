
PImage pepperoni;
void setup() {
  fill(#EDE992);
  ellipse(300, 300, 600, 600);
  fill(#FF1A21);
  ellipse(300, 300, 550, 550 );
size(600, 600);    
pepperoni = loadImage("pepperoni.png");
}
void draw() {
  

image(pepperoni, mouseX, mouseY);

}
