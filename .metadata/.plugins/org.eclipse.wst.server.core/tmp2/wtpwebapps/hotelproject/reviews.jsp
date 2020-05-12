<%
   // New location to be redirected
   String site = new String("https://www.tripadvisor.in/Hotel_Review-g304553-d3626179-Reviews-Country_Inn_Suites_By_Carlson_Mysore-Mysuru_Mysore_Karnataka.html");
   response.setStatus(response.SC_MOVED_TEMPORARILY);
   response.setHeader("Location", site); 
%>