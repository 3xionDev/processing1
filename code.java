//guh
float xPos;
float yPos;
float a;
void setup() {
  size(500, 300);
  background(#7CC7FF);
  noStroke();
  xPos = 500;
  yPos = 300;
}
void showMouseCoordinates() {
  fill(0);
  text(mouseX + " , " + mouseY, mouseX, mouseY);
}

void draw() {
  noStroke();
  background(#7CC7FF);
  fill(#FC7105);
  ellipse(435, 221, 90, 90);
  fill(#FCFC05);
  ellipse(435, 221, 80, 80);
  fill(#018E13);
  ellipse(250, 300, 600, 200);
  stroke(0);
  fill(#FFF2C1);
  rectMode(CENTER);
  rect(230, 210, 80, 60);
  rectMode(CORNER);
  shearY(-(PI/20));
  translate(0, 43);
  rect(270, 180, 30, 60);
  shearY((PI/20));
  translate(0, -43);
  fill(#B70018);
  triangle(270, 180, 300, 175, 284, 165);
  quad(190, 180, 206, 165, 284, 165, 270, 180);
  fill(#714400);
  rect(220, 210, 20, 30);
  rectMode(CENTER);
  fill(#6CE8FF);
  rect(230, 195, 60, 20);
  ellipseMode(CENTER);
  fill(0, 0 ,0);
  ellipse(235, 225, 5, 5);
  fill(255, 255, 255);
  noStroke();
  ellipse(460, 20, 60, 70);
  ellipse(468, 38, 80, 50);
  ellipse(429, 31, 80, 50);
  ellipse(99, 59, 60, 70);
  ellipse(116, 52, 80, 50);
  ellipse(128, 77, 80, 50);
  showMouseCoordinates();
}


