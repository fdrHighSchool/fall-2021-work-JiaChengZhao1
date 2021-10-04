class Module {
  int xOffset;
  int yOffset;
  float x, y;
  int unit;
  int xDirection = 1;
  int yDirection = 1;
  float speed; 
  
  Module(int xOffsetTemp, int yOffsetTemp, int xTemp, int yTemp, float speedTemp, int tempUnit) {
    xOffset = xOffsetTemp;
    yOffset = yOffsetTemp;
    x = xTemp;
    y = yTemp;
    speed = speedTemp;
    unit = tempUnit;
  }
  

  void update() {
    x = x + (speed * xDirection);
    if (x >= unit || x <= 0) {
      xDirection *= -1;
      x = x + (1 * xDirection);
      y = y + (1 * yDirection);
    }
    if (y >= unit || y <= 0) {
      yDirection *= -1;
      y = y + (1 * yDirection);
    }
  }
  

  void display() {
    fill(255);
    ellipse(xOffset + x, yOffset + y, 6, 6);
  }
}

int unit = 40;
int count;
Module[] mods;



PShape square; 
void setup() {
  size(1000, 1000);
  background(0,0,0);
  
  noStroke();
  int wideCount = width / unit;
  int highCount = height / unit;
  count = wideCount * highCount;
  mods = new Module[count];

  int index = 0;
  for (int y = 0; y < highCount; y++) {
    for (int x = 0; x < wideCount; x++) {
      mods[index++] = new Module(x*unit, y*unit, unit/2, unit/2, random(0.05, 0.8), unit);
    }
  }
}

void draw() {
  background(0);
   for (Module mod : mods) {
    mod.update();
    mod.display();
  }


fill(255,230,255);
rect(380, 300, 240, 230, 45);
fill(255,255,255);

ellipse(500, 390, 200, 380);



fill(202,235,216);
ellipse(500, 200, 140, 120); 

fill(0,255,226);
ellipse(500,200, 120, 110); 

fill(0,0,226);

triangle(446, 180, 456, 238, 494, 255);
triangle(555, 180, 543, 238, 515, 253);

fill(250,240,230);
triangle(445, 210, 494, 210, 494, 255);
triangle(558,210,510, 210, 510, 253);

fill(85,102,0);
triangle(500,146,456, 238, 494, 255);
triangle(500,146,543, 238, 510, 253);

fill(153,51,250);
triangle(540,162,456, 238, 494, 255);
triangle(461,162,543, 238, 510, 253);


fill(0,255,216);
arc(500, 260, 150, 60, 0, PI);
fill(255,255,255);
arc(500, 260, 145, 30, 0, PI);


fill(255,255,255);
ellipse(438, 592, 60, 280);
ellipse(568, 592, 60, 280);


fill(255,255,255);
ellipse(438, 750, 40, 290);
ellipse(568, 750, 40, 290);

fill(255,255,255);
ellipse(400, 157, 60, 300);
fill(255,255,255);
ellipse(600, 157, 60, 300);


stroke(255,255,255);

}
