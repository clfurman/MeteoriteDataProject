1. Navigate to the starter_files branch.
<img width="300" alt="image" src="https://github.com/clfurman/MeteoriteDataProject/assets/65421044/9450db2e-9012-4e02-9a40-74a0f5c08571">

2. Download both the SIGCSEMeteor2.java and Meteorite_Landings.csv files from the starter_files section.
3. Open the Meteorite_Landings.csv file and identify the fields you will need to represent in your Meteor record and GeoLocation record.
4. NOTE: each row represents an individual meteor and each column represents the data we know about the meteor.
   This data is <bold>immutable data </bold>. Therefore a record is the correct type of storage. 
 <img width="700" alt="image" src="https://github.com/clfurman/MeteoriteDataProject/assets/65421044/0658b41c-bbd6-435a-81b7-172043d7f83c">


5. Create your Meteor record. Be sure to add your package at the top of the files and save the file as Meteor.java.
   Since the GeoLocation contains the latitude and longitude values, we don't actually need to store the latitude and longitude values separately.
   You only need to store 8 fields.
6. Create the GeoLocation record. It will contain 2 fields. Save the file as GeoLocation.java
7. Use the runner class, SIGCSEMeteor2.java to import the data and add the meteors with a mass less than 5000 to a new list. ​
8. If you need to see the solution files, navigate to the Solution_Files branch.
