1. Navigate to the <b>starter_files</b> branch.
   
   <img width="300" alt="image" src="https://github.com/clfurman/MeteoriteDataProject/assets/65421044/9450db2e-9012-4e02-9a40-74a0f5c08571">

3. Download the files located in the <b>starter_files</b> section. You will need to extract them and save them on your computer.
   <img width="700" alt="image" src="https://github.com/clfurman/MeteoriteDataProject/assets/65421044/ff4bdf64-b9a7-472f-a161-122a9b425711">

4. Open Visual Studio Code. Open the <code>MeteoriteDataProject-starter-files</code> project by selecting <b>Open Folder</b> from the File menu.
   
   <img width="250" alt="image" src="https://github.com/clfurman/MeteoriteDataProject/assets/65421044/6b4ab5fd-9745-4920-8863-e8db946363d6">

5. Open the <b>Meteorite_Landings.csv</b> file and identify the fields you will need to represent in your <code>Meteor</code record and <code>GeoLocation</code> record. The starter files store dates as <code>String</code> objects.
   NOTE: each row represents an individual meteor and each column represents the data we know about the meteor.
   This data is <bold>immutable data </bold>. Therefore a record is the correct type of storage. 
   <img width="700" alt="image" src="https://github.com/clfurman/MeteoriteDataProject/assets/65421044/0658b41c-bbd6-435a-81b7-172043d7f83c">


6. Create your <code>Meteor</code> record. 

   <img width="250" alt="image" src="https://github.com/clfurman/MeteoriteDataProject/assets/65421044/5ee76669-712f-49b9-ab35-b814ff6340c3">

7. Be sure to add your package at the top of the files and save the file as <b>Meteor.java</b>.
   Since the <code>GeoLocation</code> contains the latitude and longitude values, we don't actually need to store the latitude and longitude values separately.
   You only need to store 8 fields. To add a new Java file to the project, click on the the file icon with the plus symbol.
8. Create the <code>GeoLocation</code> record. It will contain two fields. Save the file as <b>GeoLocation.java</b>
9. Modify the runner class, <b>SIGCSEMeteor2.java</b> to ensure the file path for the <b>Meteorite_Landings.csv</b> is where you saved it on your computer.
    Run the <b>SIGCSEMeteor2.java</b> main method to import the data and add the meteors with a mass less than 5000 to a new list. ​
10. Your solution may be similar to those in the <b>Solution_Files</b> branch.
