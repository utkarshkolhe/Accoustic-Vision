MiniProject
THIS PROJECT WILL HAVE THE FOLLOWING SCOPE:
-AN ASSET AS WELL AS COMPANION FOR VISUALLY IMPAIRED PEOPLE -EASING OUT THE WORK OF BLIND BY DETECTING OBJECTS AND PEOPLE’S FACE. -THE APP CAN BE FURTHER EXTENDED WITH VARIOUS FUNCTIONALITIES LIKE NAVIGATION ,VIDEO CALLING AND SOS FUNCTIONALITY

Software Requirements:
-Google FireBase

-Tensorflow Library

-GoogleMaps API key

-Speech To Text APIs

-Text to Speech APIs

Flow of Code:
Walkthrough:
It contains Slide screens that explain the utility of the code in 4 slides

Login:
User Interface to provide Registration form for first time user. This form can be filled using only voice input using the Speech to Text API from Google ML kit One time Registration and login for security purposes

MainMenu:
Menu is read out using Text to speech API: Firebase ML KIT Press the Speak button and Using the Keyword Vision we can name the button to be redirected accordingly

Geographically Placed buttons on the Screen with distict functions:

SOS: On single click or Voice Command sends SOS message to 5 close relatives with Geo-Location using Google maps API and a call is dialed to the closest relative

Text Reading: On clicking this button Text Detection API :Tensorflow comes into use which can read any font or style of text from almost any surface with 95% accuracy. This text is then Read out using Text to Speech API

Detection: This Button redirects us to the Object Detection API:Tensorflow which detects objects on screen with similar(90%) accuracy. Text-to-speech API is again used to read it out to the user. This UI can also Detect Expressions(based on smile curve) and Face Features of the person In front of the camera using Face Detection Algorithm:Opensource.

Profile: For the user profile filled at the time of registration and future edits and changes.

Settings: Text to speech can be disabled here
