​
## Difference between SQL and NoSQL databases?  
the main difference between SQL and NoSQL databases lies in the data model for each of them. 
In SQL databases data is stored in tables with row and columns which force the data to always be saved into a fixed structure or 
schema where we make relations between different tables using foreign keys this model makes SQL database good for complex queries transactions and it is the most commonly used database. 
NoSQL on the other side don’t have a fixed schema like SQL, however the data are saved as Objects which makes it more flexible thats why NoSQL database is better for rapidly changing data.

## Steps for running OracleDB on Clould:  
1. first I clonned oracleDB docker image to my VM and installed the image using buildDockerImage bash script offered by the oracle repository, then I started the container.  
2. Next, I located the IP address for my VM and the port number for oracleDB and established a connection to the database through Oracle SQL Developer.  
3. Then i ran a simple sql script to create BOOK table with desired columns.  
4. Lastly i have run my java application to insert books into database, and here we can make sure books were inserted through Oracle SQL Developer.   




​
