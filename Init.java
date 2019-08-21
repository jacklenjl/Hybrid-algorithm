import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;
public class Init {
  String place_name[] = {"Manali", "PangongTso", "SamSandDunes", "Mumbai", "Jimcorbetnationalpark","Ooty", "GurudongmarLake", "Munabao", "Delhi", "Nilgiribiospherereserve","Darjeeling", "Sabarmati", "Barmer", "Surat", "Baikunthapur","Kufri", "MandoviRiver", "Jaisalmer", "Pune", "BhavnagarAmreli","Mussorie", "Rushikulya", "longewala", "Jaipur", "Khasihills","Auli", "Hoogly", "valsad", "Lucknow", "Kanhanationalpark","Shimla", "UmiamLake", "Thar", "Kanpur", "Kamakhya","Gangtok", "Ulsoorlake", "Spitivalleycolddesert", "Nagpur", "Kukrail","Srinagar", "LakeTsongmo", "Bikaner", "Indore", "Keibullamjaonationalpark",
 "Munnar", "gorakhpur", "Jodhpur", "Kolkata", "ManasNationalPark",
 "Nainital", "nellore", "Chittorgarh", "Hydrabad", "Bandipurnationalpark",
  "Coorg", "DalLake", "Kumbhalgarh", "Chennai", "Girforest",
  "Gulmarg", "LoktakLake", "Bundi", "Thane", "Nallamala",
   "Almora", "Sutlej", "Pushkar", "Bhopal", "RajajiNationalPark",
   "Lonavola", "Tungabhadrariver", "Ajmer", "Patna", "Vandalur",
     "MountAbu", "Kurnool", "Khimsar", "Vadodara", "Turahalli",
      "Chikmagalu", "Lakepichola", "NubraVilley", "Agra", "Pichavaram",
      "Rishikesh", "Beasriver", "khajuwala", "Amritsar", "Nanmangalam",
      "Panchgani", "Erode", "Dholpur", "Varanasi", "PeriyarNationalPark",
     "Pachmarhi", "Vembanad", "SpitukGompa", "Meerut", "MukurthiNationalPark"

    };
    int final_counter=0;
    int finalspots[]=new int[2000];
    float finaldistance[]=new float[2000];
    float finaldevition[]=new float[2000];
    int t_spent[]={5,4,1,5,2,5,5,1,6,2,5,2,3,3,2,3,2,5,6,3,6,4,1,5,3,3,3,2,3,4,3,5,1,4,3,5,6,4,5,2,6,1,2,2,4,3,3,3,3,1,3,2,3,5,2,6,2,3,8,2,1,5,2,2,4,3,3,3,4,2,2,2,2,2,5,3,2,1,2,1,5,5,3,2,1,5,2,5,1,2,2,2,1,6,1,5,1,1,2,1};
    int t_window[][]={{9,1},{4,8},{9,2},{10,1},{9,5},{9,5},{10,5},{ 9,5},{9,2},{3,8},{9,2},{10, 1},{2,3},{9,2},{2,5},{3,5},{10,1},{10,2},{0,1},{9,0},{3,5},{9,1},{10,0},{9,2},{8,4},{10,2},{9,1},{5,0},{2,3},{9,5},{2,5},{2,5},{9,2},{9,2},{9,3},{8,5},{7,8}, {5,8},{9,2},{6,0},{3,9},{11, 1},{9, 2},{9,2},{9,2},{5,8},{9,11},{9,2},{10,1},{9,4},{2, 5},{8,3},{10,0},{9,1},{0,2},{2,3},{4,10},{9,2},{10,1},{0,2},{10,1},{0,11},{9,2},{1,11},{10, 2},{3,5},{3,5},{10,2},{9,1},{10,5},{9,4},{9,2},{9,1},{9,2},{0,11},{10,5},{9,2},{10,1},{9,2},{10, 1},{8,2},{10,1},{3,5},{9,2},{10,1},{8,9},{0,11}, {0,6},{10,2},{0,4},{8,4},{9,2},{9,1}, {10,1},{8,3},{9,5},{5,2},{10,5},{7,2},{1,5}};
    int ng;
    float dist[][] = new float[100][100];
    float t_travel[][] = new float[100][100];
    Calendar gc = new GregorianCalendar();
    int month = gc.get(Calendar.MONTH) + 1;
     int tovisit[] = new int[100];
    int visited[]=new int[100];
    float maxdur = 0;
    int prio[]=new int[5];
    Scanner sc = new Scanner(System.in);
    int temp_par[]=new int[50];
    float max_comfort;
    int recommend;
    int max_spots;
    int recommend_flag;
    int recommendation_choice;;
    int pareto[]=new int[50];
    float last_pareto_tour_time[]=new float[500];
    float last_pareto_tour_distance[]=new float[500];
    float last_pareto_deviation[]=new float[500];
    int last_pareto_scout[][]=new int[500][100];
    int last_pareto_no_spots[]=new int[500];
    int last_pareto_solutions[]=new int[500];
    int pareto_count;
    int pso_temp_scout[][]=new int[50][100];
    float pso_temp_tour_time[]=new float[50];
    float pso_temp_tour_distance[]=new float[50];
     int city_flag=0;
    float tour_time[]=new float [50];
    float tour_distance[]=new float[50];
    float deviation[]=new float[50];
    int no_spots[]=new int[50];
    int scout[][]=new int[100][100];
    int swap_flag[]=new int[50];
    int min;
    int temp1;
    int current_city;
    float temp_tour_time;
    float temp_maxdur;
    float temp_priority;
    int total_priority;
    static int PSO_modified;
    //int temp_j;
    int BCO_flag;
    int count;
    float temp;
    float priority;
    int flag;
     int min_matlab;
    int max_matlab;
    float min1_matlab;
    float max1_matlab;

    int last_solution_flag;
    int choice;
    public void readdata() {
        int i, j, t;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datasetfinal", "root", "tiger123");
            PreparedStatement ps = (PreparedStatement) con.prepareStatement("Select * from distancedatafinal");
            ResultSet rs = ps.executeQuery();
            j = 0;
            float l;
            while (rs.next()) {
                t = (rs.getInt(1));
                t = t - 1;
                l = (rs.getFloat(2));
                for (i = t; i <= t; i++) {
                    dist[i][j] = l;
	  }

                j++;
                if (j == 100)
                    j = 0;
            }
    Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/datasetfinal2", "root", "tiger123");
            PreparedStatement ps2 = (PreparedStatement) con2.prepareStatement("Select * from durationdatafinal");
            ResultSet rs2 = ps2.executeQuery();
            j = 0;

            l = 0;
            while (rs2.next()) {
                t = (rs2.getInt(1));
                t = t - 1;
                l = (rs2.getFloat(2));
                for (i = t; i <= t; i++) {
                    t_travel[i][j] = l;   }
                j++;
                if (j == 100)
                    j = 0;
            }
   } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
public void for_input_only()
    {
        float temp2;
        System.out.println("--------------------------------Welcome to our Tourism Program---------------------------------");
        try {
            System.out.println("The places you may visit:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 20; j++) {
                    if (j * 5 + i == 0) {
                        System.out.println(" ");
                        System.out.println("    Hill Stations/Mountains :");
                        System.out.println("    id:      Name:");
                        System.out.println(" ");

                    } else if (j * 5 + i == 1) {
                        System.out.println(" ");
                        System.out.println("   Water Bodies :");
                        System.out.println("    id:      Name:");
                        System.out.println(" ");
                    } else if (j * 5 + i == 2) {
                        System.out.println(" ");
                        System.out.println("   Deserts & Arid Regions:");
                        System.out.println("    id:      Name:");
                        System.out.println(" ");
                    } else if (j * 5 + i == 3) {
                        System.out.println(" ");
                        System.out.println("   Landmark cities    :");
                        System.out.println("    id:      Name:");
                        System.out.println(" ");
                    } else if (j * 5 + i == 4) {
                        System.out.println(" ");
                        System.out.println("   Forest & Wildlife :");
                        System.out.println("    id:      Name:");
                        System.out.println(" ");
                    }

                    System.out.println("    " + (j * 5 + i) + "       " + place_name[j * 5 + i]);
                }
            }

            outer:
            for (int m = 0; m < 1; m++) {
                System.out.println(" ");
                System.out.println("Please enter the types of spots you want to visit, as per  your priorities [we would plan more days for the spots with higher priorities than the   spots with lesser priorities]");
                System.out.println(" ");
                System.out.println("ENTER THE PLACES OF INTEREST (0-4), ENTER -1 TO EXIT:");
                System.out.println("0-  Hill Stations/Mountains(February-July)");
                System.out.println("1-  Water Bodies (Oceans/Beaches/Rivers)(February-October)");
                System.out.println("2-  Deserts & Arid Regions(October-February)");
                System.out.println("3-  Landmark Cities(March-September)");
                System.out.println("4-  Forests & Wildlife Reserves(September-June)");
    p:
                for (int i = 0; i < 5; i++) {
                    prio[i] = sc.nextInt();
                    if (prio[i] == -1) {
                        if (i == 0) {
                            System.out.println(" ");
                            System.out.println("You must give at least one priority.");
                            System.out.print("Please try again");
                            i--;
                            continue p;
                        }

                        break;
                    }
                    if ((prio[i] < -1) || (prio[i] > 4)) {
                        System.out.println(" ");
                        System.out.println("You have given a wrong priority");
                        System.out.print("Please try again:");
                        i--;
                        continue p;
                    }

                    for (int j = 0; j < total_priority; j++) {
                        if ((prio[j] == prio[i]) && (i != 0)) {
                            System.out.println(" ");
                            System.out.println("You have given the same priority twice." + prio[j]);
                            System.out.print("Please try again:");
                            i--;
                            continue p;
                        }

                    }
                    total_priority++;
                }

                turdur();
                if (maxdur == 0) {
                    System.out.println("We can't find any spots as per your priorities please retry with different combination. ");
                    m--;
                    continue outer;
                }

                System.out.print("Are you currently in India (press '1' if Yes or press '2' if No) : ");
                c:
                for (int i = 0; i < 1; i++) {


                    choice = sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Choose the city (number) you are currently in or the nearest place (from your current location): ");
                            city_flag = 1;
                            cc:
                            for (int j = 0; j < 1; j++) {
                                current_city = sc.nextInt();
                                if ((current_city < 0) || (current_city > 99)) {
                                    System.out.println(" ");
                                    System.out.println("You have entered a wrong city number!!!");
                                    System.out.print("Please try again: ");
                                    j--;
                                    continue cc;
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Do you have any preferred place from where you want to start the tour if Yes press 1 or if No press any other number: ");
                            choice = sc.nextInt();
                            if (choice == 1) {
                                System.out.println("Enter the city/place(number) : ");
                                city_flag = 1;
                                cc1:
                                for (int j = 0; j < 1; j++) {
                                    current_city = sc.nextInt();
                                    if ((current_city < 0) || (current_city > 99)) {
                                        System.out.println(" ");
                                        System.out.println("You have entered a wrong city number!!!");
                                        System.out.print("Please try again: ");
                                        j--;
                                        continue cc1;
                                    }
                                }

                            }
                            break;
                        default:
                            System.out.println(" ");
                            System.out.println("Wrong choice!!!");
                            System.out.print("Please try again: ");
                            i--;
                            continue c;
                    }
                }
                nd:
                for (int j = 0; j < 1; j++) {
                    System.out.print("Enter how many days you want to tour (range 5 to " + (int)maxdur + "): ");
   temp2 = sc.nextInt();
                    if ((temp2 > maxdur) || (temp2 < 2)) {
                        System.out.println("You have given wrong number of days.");
                        System.out.print("Please give a number that falls in the range");
                        j--;
                        continue nd;
                    } else
                        maxdur = temp2;
                }
            }
       recommendation:
            for (int i = 0; i < 1; i++) {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Please enter your preference so that the system can recommend your best tour plan :");
                System.out.println("press 1:To have More Comfort");
                System.out.println("press 2:TO visit more spots[less comfort] ");
                recommendation_choice = sc.nextInt();
                if ((recommendation_choice != 1) && (recommendation_choice != 2)) {
                    System.out.println("wrong choice!!!");
                    System.out.println("please reenter!!");
                    continue recommendation;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("You may have entered an float/double value or some other character when you supposed to press an integer. Please run the program again");
            System.exit(0);
        }
   }
    public void turdur()
    {

        for (int i = 0; i < total_priority; i++) {//calculating maximum duration of the tour
            for (int j = 0; j < 20; j++) {


                if (t_window[prio[i] + 5 * j][0] < t_window[prio[i] + 5 * j][1]) {

                    if ((t_window[prio[i] + 5 * j][0] <= month) && (t_window[prio[i] + 5 * j][1] >= month)) {

                        maxdur = maxdur + t_spent[prio[i] + 5 * j];

                        tovisit[prio[i] + 5 * j] = 1;

                    }
                } else {

                    if ((t_window[prio[i] + 5 * j][0] <= month) || (t_window[prio[i] + 5 * j][1] >= month)) {

                        maxdur = maxdur + t_spent[prio[i] + 5 * j];

                        tovisit[prio[i] + 5 * j] = 1;

                    }
                }
            }

        }
    }

    public void BCO_phase1()

    {
        System.out.println("------------------------------------------BCO_phase1--------------------------------------");

        if(BCO_flag!=1) {//only works for first generation

            for (int i = 0; i < 50; i++) {

                for (int j = 0; j < 100; j++) {

                    scout[i][j] = 9999;

                }

                tour_time[i] = 0;

                no_spots[i] = 0;

            }
        }

        BCO_flag=1;
        if(city_flag==1)// if preferred or current city is given
        {
            for(int i=0;i<50;i++)
                if(tour_time[i]==0) {
                    scout[i][0] = current_city;
                    no_spots[i]=1;
                }
        }
        for(int i=6-total_priority;i>=2;i--)//calculating the priorities
        {
            temp_priority=temp_priority+(0.05f*i);
        }

        for(int k=0;k<50;k++)//generating the chromosomes
        {
	        if(tour_time[k]<maxdur)//checking if there is any scope of adding a new particle to the chromosome
            {
                for(int i=0;i<100;i++)

                    visited[i]=0;
                for(int i=0;i<100;i++)
                {
                    if(scout[k][i]!=9999)
                    {
	        visited[scout[k][i]]=1;
                    }
                }
                temp_maxdur=maxdur-tour_time[k];
                temp_tour_time=tour_time[k];
                tour_time[k]=0;
                temp=0;
                priority=.3f+(temp_priority/total_priority);
            for(int n=0;n<total_priority;n++)

                {
            for(int i=0;i<500 && tour_time[k]<=temp_maxdur*priority+temp;i++)     {

                        int mul=(int)(Math.random()*20);

                        if((tovisit[prio[n]+5*mul]==1)&&(visited[prio[n]+5*mul]!=1))//checking if the selected particle is already been include in the chromosome or not and if it can be include in the chromosome or not
            { scout[k][no_spots[k]]=prio[n]+5*mul;
             visited[prio[n]+5*mul]=1;
            if(no_spots[k]==0)

                            {

                                tour_time[k]=tour_time[k]+t_spent[prio[n]+5*mul];//calculating tour_time
                            }
   else

                            {

                       tour_time[k]=tour_time[k]+t_spent[prio[n]+5*mul]+t_travel[scout[k][no_spots[k]-1]][scout[k][no_spots[k]]];//calculating tour_time

                                tour_distance[k]=tour_distance[k]+dist[scout[k][no_spots[k]-1]][scout[k][no_spots[k]]];//calculating distance

                            }

                            if(tour_time[k]>temp_maxdur)//backtracking the distance and tour_time calculation

                     
          tour_time[k]=tour_time[k]-t_spent[prio[n]+5*mul]-t_travel[scout[k][no_spots[k]-1]][scout[k][no_spots[k]]];

                                tour_distance[k]=tour_distance[k]-dist[scout[k][no_spots[k]-1]][scout[k][no_spots[k]]];

                                scout[k][no_spots[k]]=9999;

                                no_spots[k]--;

                            }

                            no_spots[k]++;
         }
   }

                    temp=temp+temp_maxdur*priority;

                    priority=priority-0.05f;
   }

                tour_time[k]=tour_time[k]+temp_tour_time;

            

        
        for(i=0;i<50;i++)//calculating deviation

           { deviation[i]=maxdur-tour_time[i];

            for(int i=0;i<50;i++)//Output of this phase

            {
            System.out.println("Route :"+i);

            for(int j=0;j<100;j++)

            {
                if(scout[i][j]!=9999)
                    System.out.print("  "+scout[i][j]);

            }

            System.out.println(" ");

            System.out.println(" tour_distance ="+tour_distance[i]);

            System.out.println(" tour_time ="+tour_time[i]);

            System.out.println(" deviation ="+deviation[i]);

            System.out.println(" no_spots ="+no_spots[i]);

            System.out.println(" ");
        }
    }
}

    
}
    public void PSO_phase2()
    {
        System.out.println("------------------------------------------PSO_phase2--------------------------------------");
 PSO_modified=0;

        for(int i=0;i<50;i++)
        {
            for(int j=0;j<no_spots[i];j++)
                pso_temp_scout[i][j]=scout[i][j];
            pso_temp_tour_time[i]=tour_time[i];
            pso_temp_tour_distance[i]=tour_distance[i];
            swap_flag[i]=0;

        }
        for(int i=0;i<50;i++)//trying to improve the chromosomes
        {
            for(int j=0;j<no_spots[i]-2;j++)
            {
                flag=0;
                min=j+1;

                for(int k=j+1;k<no_spots[i]-1;k++)
                {
                 if((dist[scout[i][j]][scout[i][min]]>=dist[scout[i][j]][scout[i][k+1]])&&(t_travel[scout[i][j]][scout[i][min]]>=t_travel[scout[i][j]][scout[i][k+1]]))//checking velocity
                    {
                        min=k+1;
                        swap_flag[i]=1;
                        flag=1;
                    }

                }
                if(flag==1)
                {
                    temp1=scout[i][j+1];
                    scout[i][j+1]=scout[i][min];
                    scout[i][min]=temp1;
                }
            }
        }

        for(int i=0;i<50;i++)//calculating the distance and tour_time for altered particles
        {
            if(swap_flag[i]==1)
            {
                tour_time[i]=0;
                tour_distance[i]=0;
                for(int j=0;j<no_spots[i];j++)
                {
                    if(j==0)
                        tour_time[i]=tour_time[i]+t_spent[scout[i][j]];
                    else {
                        tour_time[i] = tour_time[i] + t_spent[scout[i][j]] + t_travel[scout[i][j - 1]][scout[i][j]];
                        tour_distance[i] = tour_distance[i] + dist[scout[i][j - 1]][scout[i][j]];
                    }

                }

                deviation[i]=maxdur-tour_time[i];
                swap_flag[i]=0;
            }
        }

        for(int i=0;i<50;i++)//checking if all the chromosomes improved or not
        {
            if((tour_time[i]>pso_temp_tour_time[i])||(tour_distance[i]>pso_temp_tour_distance[i]))
            {
                for(int j=0;j<no_spots[i];j++)
                    scout[i][j]=pso_temp_scout[i][j];
                tour_time[i]=pso_temp_tour_time[i];
                tour_distance[i]=pso_temp_tour_distance[i];
                deviation[i]=maxdur-tour_time[i];
            }

            else if((tour_time[i]<pso_temp_tour_time[i])&&(tour_distance[i]<pso_temp_tour_distance[i]))
                PSO_modified=1;
        }

        for(int i=0;i<50;i++)//output of this phase
        {
     System.out.println("Route :"+i);
   for(int j=0;j<100;j++)
 {
                if(scout[i][j]!=9999)
                    System.out.print("  "+scout[i][j]);

            }

            System.out.println(" ");

            System.out.println(" tour_distance ="+tour_distance[i]);

            System.out.println(" tour_time ="+tour_time[i]);

            System.out.println(" deviation ="+deviation[i]);

            System.out.println(" no_spots ="+no_spots[i]);

            System.out.println(" ");
        }

    }
    public void PARETO_phase3()
    {
        System.out.println("------------------------------------------Pareto_phase3--------------------------------------");

        int n=50;
        if(last_solution_flag==1)
            n=pareto_count;

        for(int i=0;i<n;i++)
            temp_par[i]=i;

        for(int i=0;i<n;i++)
            for(int j=0;j<n-1-i;j++)
            {
                if(no_spots[temp_par[j]]<no_spots[temp_par[j+1]])
                {
                    temp1=temp_par[j];
                    temp_par[j]=temp_par[j+1];
                    temp_par[j+1]=temp1;
                }

            }

        for(int i=0;i<n;i++)//calculation for pareto optimal solution selection
        {
            if(temp_par[i]!=-1)
                for(int j=i;j<n-1;j++)
                {

                    if((temp_par[j+1]!=-1)&&(temp_par[i]!=-1))
                    {

                        if ((deviation[temp_par[i]] <= deviation[temp_par[j + 1]]) && (tour_distance[temp_par[i]] <= tour_distance[temp_par[j + 1]]))
                        {
                            temp_par[j + 1] = -1;
                        }

                        else if ((deviation[temp_par[i]] >= deviation[temp_par[j + 1]]) && (tour_distance[temp_par[i]] >= tour_distance[temp_par[j + 1]])&&(no_spots[temp_par[i]]==no_spots[temp_par[j+1]])) {

                            temp_par[i] = -1;
                        }


                    }
                }
        }
 for(int i=0;i<50;i++)//output of this phase

        {
            if (temp_par[i] != -1) {
                System.out.println("Route :" + i);

                for (int j = 0; j < 100; j++) {
                    if (scout[i][j] != 9999)
                        System.out.print("  " + scout[i][j]);

                }

                System.out.println(" ");

                System.out.println(" tour_distance =" + tour_distance[i]);

                System.out.println(" tour_time =" + tour_time[i]);

                System.out.println(" deviation =" + deviation[i]);

                System.out.println(" no_spots =" + no_spots[i]);

                System.out.println(" ");
            }
        }

    }
    public void for_matlab_pso()

    {
        min_matlab=no_spots[0];
        max_matlab=no_spots[0];
        for(int i=1;i<50;i++)
        {
            if(min_matlab>no_spots[i])
                min_matlab=no_spots[i];
            if(max_matlab<no_spots[i])
                max_matlab=no_spots[i];
        }
        System.out.println(" ");
        System.out.println("Min of no_spots: "+min_matlab);
        System.out.println("Max of no_spots: "+max_matlab);

        System.out.println(" ");
        System.out.println("Number of spots: ");
        for(int i=0;i<50;i++)
        {

            System.out.println(no_spots[i]);

        }
        min1_matlab=deviation[0];
        max1_matlab=deviation[0];
        for(int i=1;i<50;i++)
        {
            if(min1_matlab>deviation[i])
                min1_matlab=deviation[i];
            if(max1_matlab<deviation[i])
                max1_matlab=deviation[i];
        }
        System.out.println(" ");
        System.out.println("Min of deviation: "+min1_matlab);
        System.out.println("Max of deviation: "+max1_matlab);

        System.out.println(" ");
        System.out.println("deviation: ");
        for(int i=0;i<50;i++)
        {

            System.out.println((deviation[i]/max1_matlab)*100);

        }
min1_matlab=tour_distance[0];
        max1_matlab=tour_distance[0];
        for(int i=1;i<50;i++)
        {
            if(min1_matlab>tour_distance[i])
                min1_matlab=tour_distance[i];
            if(max1_matlab<tour_distance[i])
                max1_matlab=tour_distance[i];
        }
        System.out.println(" ");
        System.out.println("Min of distance: "+min1_matlab);
        System.out.println("Max of distance: "+max1_matlab);


        System.out.println(" ");
        System.out.println("distance: ");
        for(int i=0;i<50;i++)
        {

            System.out.println((tour_distance[i]/max1_matlab)*100);
        }
        //sc.nextLine();
    }
    public void for_matlab()
    {
        System.out.println("---------------------------Final for this generation--------------------------------");

        min_matlab=no_spots[0];
        max_matlab=no_spots[0];
        for(int i=1;i<50;i++)
        {
            if(min_matlab>no_spots[i])
                min_matlab=no_spots[i];
            if(max_matlab<no_spots[i])
                max_matlab=no_spots[i];
        }
        System.out.println(" ");
        //System.out.println("Min of no_spots: "+min_matlab);
        //System.out.println("Max of no_spots: "+max_matlab);

        System.out.println(" ");
        System.out.println("Number of spots: ");
        for(int i=0;i<50;i++)
        {
            finalspots[final_counter]=no_spots[i];
            final_counter++;

            //System.out.println(no_spots[i]);

        }
      min1_matlab=deviation[0];
        max1_matlab=deviation[0];
        for(int i=1;i<50;i++)
        {
            if(min1_matlab>deviation[i])
                min1_matlab=deviation[i];
            if(max1_matlab<deviation[i])
                max1_matlab=deviation[i];
        }
        System.out.println(" ");
        //System.out.println("Min of deviation: "+min1_matlab);
        //System.out.println("Max of deviation: "+max1_matlab);
        double max2_matlab=max1_matlab;

        System.out.println(" ");
        System.out.println("deviation: ");
        final_counter=final_counter-50;
        for(int i=0;i<50;i++)
        {
            finaldevition[final_counter]=(deviation[i]/max1_matlab)*100;
            final_counter++;
            //System.out.println((deviation[i]/max1_matlab)*100);
        }
        min1_matlab=tour_distance[0];
        max1_matlab=tour_distance[0];
        for(int i=1;i<50;i++)
        {
            if(min1_matlab>tour_distance[i])
                min1_matlab=tour_distance[i];
            if(max1_matlab<tour_distance[i])
                max1_matlab=tour_distance[i];
        }
        System.out.println(" ");
        //System.out.println("Min of distance: "+min1_matlab);
        //System.out.println("Max of distance: "+max1_matlab);
        System.out.println(" ");
        System.out.println("distance: ");
        final_counter=final_counter-50;

        for(int i=0;i<50;i++)
        {
            finaldistance[final_counter]=(tour_distance[i]/max1_matlab)*100;
            final_counter++;
            //System.out.println((tour_distance[i]/max1_matlab)*100);
        }

        System.out.println(" ");
        System.out.println("Pareto solution details----------------------------------------------------------------");

        System.out.println(" ");
        System.out.println("Number of spots  for pareto");
        for(int i=0;i<50;i++)
            if(temp_par[i]!=-1)
                System.out.println(no_spots[i]);

        System.out.println(" ");
        System.out.println("deviation for pareto");
        for(int i=0;i<50;i++)
            if(temp_par[i]!=-1)
                System.out.println((deviation[temp_par[i]]/max2_matlab)*100);

        System.out.println(" ");
        System.out.println("distance for pareto");
        for(int i=0;i<50;i++)
            if(temp_par[i]!=-1)
                System.out.println((tour_distance[temp_par[i]]/max1_matlab)*100);
//sc.nextLine();
    }
 public void BCO_phase4() {

        System.out.println("----------------------------------------------- ABCO_phase4 ----------------------------------");
  count = 0;
        for (int i = 0; i < 50; i++)//only pareto
        {
            if (temp_par[i] != -1) {
                pareto[count] = temp_par[i];
                count++;
            }
        }
        for (int i = 0; i < 50; i++)//selecting only pareto
        {
            flag = 0;
            for (int j = 0; j < count; j++) {
                if (i == pareto[j]) {
                    flag = 1;
                    break;
                }
            }
      if (flag == 0) {
                for (int j = 0; j < 100; j++)
                    scout[i][j] = 9999;
                tour_time[i] = 0;
                tour_distance[i] = 0;
                deviation[i] = maxdur;
                no_spots[i] = 0;
            }
        }
 for (int i = 0; i < 50; i++)//getting out of local optima
        {
            if (no_spots[i] != 0)
                if (last_pareto_solutions[i] == 3) {
                    System.out.println(" ");
                    System.out.println("Removing Route :" + i+" from Local optima");
                    System.out.println("tour_distance = " + tour_distance[i]);
                    System.out.println("deviation = " + deviation[i]);
                    System.out.println("tour_time = " + tour_time[i]);
                    System.out.println("no_spots = " + no_spots[i]);

                    for (int j = 0; j < 100; j++) {
                        last_pareto_scout[pareto_count][j] = scout[i][j];
                        scout[i][j] = 9999;
                    }
                    last_pareto_tour_time[pareto_count] = tour_time[i];
                    last_pareto_tour_distance[pareto_count] = tour_distance[i];
                    last_pareto_deviation[pareto_count] = deviation[i];
                    last_pareto_no_spots[pareto_count] = no_spots[i];
                    pareto_count++;

                    tour_time[i] = 0;
                    tour_distance[i] = 0;
                    deviation[i] = 0;
                    no_spots[i] = 0;

                }
        }

        for (int i = 0; i < 50; i++) {//keeping track of how many times chromosomes are repeated over the generation
            if (no_spots[i] == 0)
                last_pareto_solutions[i] = 0;
            else
                last_pareto_solutions[i]++;
        }

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("These Pareto Optimal solution will be passed to the next generation :");

        for (int i = 0; i < 50; i++) {//output of this phase
            if (no_spots[i] > 0) {
                System.out.println("Route :" + i);
                for (int j = 0; j < 100; j++) {
                    if(scout[i][j]!=9999)
                        System.out.print("  " + scout[i][j]);
                }
                System.out.println(" ");
                System.out.println("tour_distance = " + tour_distance[i]);
                System.out.println("deviation = " + deviation[i]);
                System.out.println("tour_time = " + tour_time[i]);
                System.out.println("no_spots = " + no_spots[i]);
                System.out.println(" ");
               //  }
            }

        }
    }
    public void Final_solutions()
    {
        System.out.println("-----------------------------------------Final phase-----------------------");

        for(int i=0;i<50;i++)//storing last few pareto solutions
        {
            if(no_spots[i]>0)
            {
                for(int j=0;j<100;j++)
                    last_pareto_scout[pareto_count][j]=scout[i][j];
                last_pareto_tour_time[pareto_count]=tour_time[i];
                last_pareto_tour_distance[pareto_count]=tour_distance[i];
                last_pareto_deviation[pareto_count]=deviation[i];
                last_pareto_no_spots[pareto_count]=no_spots[i];
                pareto_count++;
            }
        }
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Set of Pareto Optimal solutions: ");
        for(int i=0;i<pareto_count;i++) {

            System.out.println("Route :"+i);
            for (int j = 0; j < 100; j++) {
                if(last_pareto_scout[i][j]!=9999)
                    System.out.print("--> "+place_name[last_pareto_scout[i][j]]);
 }
            System.out.println(" ");
            System.out.println("tour_distance = "+ last_pareto_tour_distance[i]);
            System.out.println("deviation = "+last_pareto_deviation[i]);
            System.out.println("tour_time = "+last_pareto_tour_time[i]);
            System.out.println("no_spots = "+last_pareto_no_spots[i]);
            System.out.println(" ");
            System.out.println(" ");
        }
        for(int i=0;i<pareto_count;i++)//copying the last pareto solutions
        {
		   for(int j=0;j<100;j++)
                scout[i][j]=last_pareto_scout[i][j];
            tour_time[i]=last_pareto_tour_time[i];
            tour_distance[i]=last_pareto_tour_distance[i];
            deviation[i]=last_pareto_deviation[i];
            no_spots[i]=last_pareto_no_spots[i];
        }
        last_solution_flag=1;
        PARETO_phase3();
        System.out.println("-----------------------------------------Output of our Tourism Program-----------------------");

        System.out.println("All Pareto Optimal Routes:---------------------------- ");//output of this phase
        for(int i=0;i<pareto_count;i++)
            if(temp_par[i]!=-1) {
                System.out.println("Route :"+i);
                for (int j = 0; j < 100; j++) {
                    if(scout[i][j]!=9999)
                        System.out.print("-->  "+place_name[scout[i][j]]);
                }
                System.out.println(" ");
                System.out.println("tour_distance = "+ tour_distance[i]);
                System.out.println("deviation = "+deviation[i]);
                System.out.println("tour_time = "+tour_time[i]);
                System.out.println("no_spots = "+no_spots[i]);
                System.out.println(" ");
                System.out.println(" ");

            //recommendation calculation
                //for comfort
                if(recommendation_choice==1) {
                    if (recommend_flag == 0) {
                        max_comfort = tour_distance[i] / tour_time[i];
                        recommend = i;
                        recommend_flag = 1;
                    }
                    if (max_comfort > tour_distance[i] / tour_time[i]) {
                        max_comfort = tour_distance[i] / tour_time[i];
                        recommend = i;
                    }
                }
                //for spots
                else {
                    if (recommend_flag == 0) {
                        max_spots = no_spots[i];
                        recommend_flag = 1;
                    }
                    if (max_spots < no_spots[i]) {
                        max_spots = no_spots[i];
                    }
                }

            }
        if(recommendation_choice==1)
        System.out.print(" Recommended Tour plan [As per comfort]: "+recommend);

        else {
            System.out.print(" Recommended tour plan[As per number of spots]: ");
            for (int i = 0; i < pareto_count; i++)
                if (temp_par[i] != -1) {
                    if (no_spots[i] == max_spots) {
                        System.out.print(" " + i + ", ");
                    }
                }
        } }

    public static void main(String args[])
    {
        Init a=new Init();
        a.readdata();
        a.for_input_only();
        for(int i=0;i<20;i++) {
            System.out.println("-------------------------------------------GENERATION "+i+"----------------------");
            int p=0;
            do {
                System.out.println("-------------------------------------------SUB-GENERATION "+p+"----------------------");

                a.BCO_phase1();
                a.PSO_phase2();
                if(i==0) {
                    //System.out.println("-------------------------------------------SUB-GENERATION " + p + "----------------------");
                    //a.for_matlab_pso();
                }
                p++;
  }while(PSO_modified!=0);
            a.PARETO_phase3();
            //System.out.println("-------------------------------------------GENERATION "+i+"----------------------");
            //a.for_matlab();

            a.BCO_phase4();
        }
        System.out.println(" ");

        //System.out.println("-------------------------------------All solutions for all generation(1-1000)");
        //System.out.println(" ");

        //a.final_print();
        //System.out.println("-------------------------------------End of All solutions for all generation(1-1000)");
        System.out.println(" ");
        System.out.println(" ");
        a.Final_solutions();

    }
}

