# SciFi UI Project

Name: Kieran Mac Hale

Student Number: C16777089

Fork this repository and use it a starter project for your assignment

Youtube link: https://www.youtube.com/watch?v=kji68Ztqgpk&feature=youtu.be

# Description of the assignment
To create a science fiction inspired UI using object oriented programming in java.

# Instructions
The program is supposed to display the speed controls of a space ship. Use the 'W', 'Z' and 'S' keys to go to warp speed, slow down and stop respectively. 

# How it works
This is an object oriented java program that uses classes, objects, and the PApplet processing library to generate some basic graphics. From the main method the startUI method is called, which acts as the main processing class for drawing and rendering. The classes consist of fields such as x and y co-ordinates, along with methods that do processes to these fields; such as asign them a random x or y co-ordinate as seen in the 'Star' class. 

# What I am most proud of in the assignment
I was relatively happy with how the animation of the stars looks when speeding up and slowing down. I had some difficulty making the text visible while using the fill() method for the underlaying panel, so I was happy to solve that problem.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

