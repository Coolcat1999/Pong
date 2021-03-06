package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	double xVel, yVel, x, y;
	public Ball()
	{
		x=450;
		y=250;
		xVel=-0.3;
		yVel=0.05;
	}
	public void draw(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillOval(((int)x-10),((int)y- 20), 20, 20);
	}
	public void checkPaddleCollision(Paddle p1, Paddle p2)
	{
		if(x<50)
		{
			if(y>=p1.getY()&&y<=p1.getY()+80)
			{
				xVel=-1.2*xVel;
			//	yVel=-yVel;
			}
		}
		else if(x>850)
		{
			if(y>=p2.getY()&&y<=p2.getY()+80)
			{
				xVel=-xVel;
				
			}
		}
	}
	public void move()
	{
		x+=xVel;
		y+=yVel;
		if(y<10)
		{
			yVel=-yVel;
		}
		if(y>490)
		{
			yVel=-yVel;
		}
		
	}
	public int getX()
	{
		return (int)x;
	}
	public int getY()
	{
		return (int)y;
	}
}
