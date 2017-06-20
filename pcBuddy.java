/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcbuddy;
import java.lang.*;
import java.util.Random;
import java.text.*;
import java.io.*;
import com.sun.management.OperatingSystemMXBean;
import java.awt.*;
import java.awt.event.*;
import java.lang.management.ManagementFactory;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
/**
 *
 * @author froze_000
 */


public class pcBuddy
{      OperatingSystemMXBean osi = (com.sun.management.OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean();
       long freeMemory = osi.getFreePhysicalMemorySize();
       double cpuLoad = osi.getSystemCpuLoad() * 100;
       long totalMemory = osi.getTotalPhysicalMemorySize();
       long diskSize = new File("/").getTotalSpace();
       long diskFree = new File("/").getFreeSpace();
       long diskUsable = new File("/").getUsableSpace();
       int flag = 0;//   0 Should be CPU, 1 MEMORY
       static Timer t;
       private final javax.swing.JMenuBar jMenuBar1;
       private final javax.swing.JMenu jMenu1;
       private final javax.swing.JMenuItem jMenuItem1;
       private final javax.swing.JMenuItem jMenuItem2;
       private final javax.swing.JMenuItem jMenuItem3;
       private final javax.swing.JPanel jPanel1;
       private final javax.swing.JPanel jPanel2;
       private final javax.swing.JPanel jPanel3;
       private javax.swing.JButton jButton1;
       Random ran = new Random();
       int a,b,c;
    public pcBuddy()
    {
        final int WINDOW_WIDTH = 320, WINDOW_HEIGHT = 330;
        JFrame window = new JFrame("Resource Viewer");
        window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice defaultScreen = ge.getDefaultScreenDevice();
        Rectangle rect = defaultScreen.getDefaultConfiguration().getBounds();
        int x = (int) rect.getMaxX() - window.getWidth();
        int y = 0;
        window.setLocation(x, y);
        window.setUndecorated(true);
        
        window.setLayout(null);
        window.setVisible(true);
        
        jPanel1 = new javax.swing.JPanel();
        
        jPanel3 = new javax.swing.JPanel();
        
        jPanel2 = new javax.swing.JPanel();
        
        jButton1 = new javax.swing.JButton();
         
       jMenuBar1 = new javax.swing.JMenuBar();
       jMenu1 = new javax.swing.JMenu();
       jMenuItem1 = new javax.swing.JMenuItem();
       jMenuItem2 = new javax.swing.JMenuItem();
       jMenuItem3 = new javax.swing.JMenuItem();
       
       jMenu1.setText("Themes");
       jMenuItem1.setLabel("Dark Theme");
       jMenuItem2.setLabel("Rainbow");
       jMenuItem3.setLabel("Default");
       jMenu1.add(jMenuItem1);
       jMenu1.add(jMenuItem2);
       jMenu1.add(jMenuItem3);
       jMenuBar1.add(jMenu1);
       
       
       window.setJMenuBar(jMenuBar1);
       
       jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                window.getContentPane().setBackground(new Color(44,44,44));
                
                
                jPanel1.setBackground(new Color(77,77,77));
                 jPanel2.setBackground(new Color(77,77,77));
                  jPanel3.setBackground(new Color(77,77,77));
                

            }
        });
       
       jMenuItem2.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(java.awt.event.ActionEvent evt){
                a=ran.nextInt()%256;
                b=ran.nextInt()%256;
                c=ran.nextInt()%256;
                if(a<0)
                    a+=(-a)*2;
                if(b<0)
                    b+=(-b)*2;
                if(c<0)
                    c+=(-c)*2;
               
                window.getContentPane().setBackground(new Color(a,b,c));
                 a=ran.nextInt()%256;
                b=ran.nextInt()%256;
                c=ran.nextInt()%256;
                if(a<0)
                    a+=(-a)*2;
                if(b<0)
                    b+=(-b)*2;
                if(c<0)
                    c+=(-c)*2;
                jPanel1.setBackground(new Color(a,b,c));
                a=ran.nextInt()%256;
                b=ran.nextInt()%256;
                c=ran.nextInt()%256;
                if(a<0)
                    a+=(-a)*2;
                if(b<0)
                    b+=(-b)*2;
                if(c<0)
                    c+=(-c)*2;
                jPanel2.setBackground(new Color(a,b,c));
                a=ran.nextInt()%256;
                b=ran.nextInt()%256;
                c=ran.nextInt()%256;
                if(a<0)
                    a+=(-a)*2;
                if(b<0)
                    b+=(-b)*2;
                if(c<0)
                    c+=(-c)*2;
                jPanel3.setBackground(new Color(a,b,c));
            }});
       
       jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                window.getContentPane().setBackground(new Color(238,238,238));
                
                
                jPanel1.setBackground(new Color(238,238,238));
                 jPanel2.setBackground(new Color(238,238,238));
                  jPanel3.setBackground(new Color(238,238,238));
                

            }
        });
            
       
       
               
        
        
        
        JLabel osVersionLabel;
        osVersionLabel = new JLabel ("OS Version: " +System.getProperty("os.name"));
        osVersionLabel.setForeground(Color.lightGray);
        osVersionLabel.setSize(300, 10);
        window.add(osVersionLabel);
        
       // JLabel cpuLabel;//CHANGE TO barLabel later
       // cpuLabel = new JLabel (" ");
        //osVersionLabel.setForeground(Color.lightGray);
       // cpuLabel.setSize(300, 20);
       // cpuLabel.setLocation(20, 30);
        //cpuLabel.setVisible(true);
       // cpuLabel.setText("CPU Usage Percentage (main core)");
        
       // cpuLabel.setFont(new Font("Calibri", Font.BOLD, 18));
       // window.add(cpuLabel);
        
       // JLabel memoryLabel;//CHANGE TO barLabel later
       // memoryLabel = new JLabel (" ");
       // //osVersionLabel.setForeground(Color.lightGray);
       //  memoryLabel.setSize(300, 20);
        ///memoryLabel.setLocation(20, 120);
      //  memoryLabel.setVisible(true);
      //  memoryLabel.setText("Memory Usage");
        
      //  memoryLabel.setFont(new Font("Calibri", Font.BOLD, 18));
       // window.add(memoryLabel);
        
        JLabel usedMemLabel;
        usedMemLabel = new JLabel (" ");
         usedMemLabel.setSize(300, 20);
        usedMemLabel.setLocation(8, 156);
        usedMemLabel.setVisible(true);
        usedMemLabel.setText("ex");
        usedMemLabel.setFont(new Font("Rockwell", Font.ITALIC,12));
        window.add(usedMemLabel);
        
        JLabel totalMemLabel;
        totalMemLabel = new JLabel (" ");
        totalMemLabel.setSize(300, 20);
        totalMemLabel.setLocation(100, 156);
        totalMemLabel.setVisible(true);
        totalMemLabel.setText("ex");
        totalMemLabel.setFont(new Font("Rockwell", Font.ITALIC,12));
        window.add(totalMemLabel);
        
       // JLabel diskLabel;//CHANGE TO barLabel later
       // diskLabel = new JLabel (" ");
        //osVersionLabel.setForeground(Color.lightGray);
       // diskLabel.setSize(300, 20);
       // diskLabel.setLocation(20, 260 );
       // diskLabel.setVisible(true);
        //diskLabel.setText("Space used in Local Disk");
        
      //  diskLabel.setFont(new Font("Calibri", Font.BOLD, 18));
      //  window.add(diskLabel);
        
        JLabel upInfo = new JLabel("");
        upInfo.setSize(300, 20);
        upInfo.setLocation(8, 242 );
        upInfo.setVisible(true);
        upInfo.setFont(new Font("Rockwell", Font.ITALIC,12));
        window.add(upInfo);
        
        JLabel downInfo = new JLabel("");
        downInfo.setSize(300, 20);
        downInfo.setLocation(150, 242 );
        downInfo.setVisible(true);
        downInfo.setFont(new Font("Rockwell", Font.ITALIC,12));
        window.add(downInfo);
        
        
        JProgressBar cpuBar;
        cpuBar = new JProgressBar();
        cpuBar.setMinimum(0);
        cpuBar.setMaximum(100);
        cpuBar.setBounds(50,35,260,20);
        cpuBar.setLocation(10,70);
        window.add(cpuBar);
        
       
        
         JProgressBar diskBar;
        diskBar = new JProgressBar();
        diskBar.setMinimum(0);
        diskBar.setMaximum(100);
        diskBar.setBounds(50,35,260,20);
        diskBar.setLocation(10,300);
        window.add(diskBar);
        
        

        
        JProgressBar memBar;
        memBar = new JProgressBar();
        memBar.setMinimum(0);
        memBar.setMaximum(100);
        memBar.setBounds(50,35,260,20);
        memBar.setLocation(10,160);
        window.add(memBar);
        
         jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Memory Usage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 0, 12))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(348, 80));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(memBar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(memBar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPU Usage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 0, 12))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cpuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cpuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hard Disk Space", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Rockwell", 0, 12))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(348, 80));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(diskBar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(diskBar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jButton1.setText("EXIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(window.getContentPane());
        window.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );
            
         
                jButton1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
       System.exit(0);
    }
});
        /*
        JButton cpuButton;
        cpuButton = new JButton ("CPU Usage");
        cpuButton.setSize(100,30);
        cpuButton.setLocation(50,200);
        window.add(cpuButton);
        
        JButton memoryButton;
        memoryButton = new JButton ("Memory");
        memoryButton.setSize(100,30);
        memoryButton.setLocation(170,200);
        window.add(memoryButton);
        
        JButton diskButton;
        diskButton = new JButton ("Hard Disk");
        diskButton.setSize(100,30);
        diskButton.setLocation(300,200);
        window.add(diskButton);
        */
         t = new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            
            DecimalFormat df = new DecimalFormat("#.##");
                
            //CPU
            cpuBar.setValue((int)(osi.getSystemCpuLoad() * 100));
            //System.out.println((int)(osi.getSystemCpuLoad() * 100));
            cpuBar.setVisible(true);
            cpuBar.setStringPainted(true);
            
            
            
            
            //DISK
            long diskSize = new File("/").getTotalSpace();
            long diskFree = new File("/").getFreeSpace();
            long diskUsable = new File("/").getUsableSpace();
            long diskUsed = diskSize - diskFree;
            
            
            System.out.println("size"+diskSize);
            
            System.out.println("free"+diskFree);
            
            System.out.println("usable"+ diskUsable);
            //System.out.println("percent " +  ((double)diskSize / (double)diskFree));
            
            double division = ((double)diskUsed /(double) diskFree)*100; 
           
            diskBar.setVisible(true);
            diskBar.setStringPainted(true);
            double gbUsed = (double)diskUsed / 1073741824;
            double gbTotal = (double)diskSize / 1073741824;
            
            String formatted = df.format(gbUsed);
            String formatted2 = df.format(gbTotal);
            
            upInfo.setText("Space Used: "+formatted+ " GB.");
            downInfo.setText("Out of a total: " +formatted2+ " GB.");
            
            
            double betterDivision = (gbUsed / gbTotal) * 100;
            int res = (int)betterDivision;
            diskBar.setValue(res);
            System.out.println(res);
            upInfo.setVisible(true);
            downInfo.setVisible(true);
            
            
            //MEMORY
            long usedMemory = osi.getTotalPhysicalMemorySize() - osi.getFreePhysicalMemorySize();
            double division1 = ((double) usedMemory/osi.getTotalPhysicalMemorySize()) *100;
            memBar.setValue((int)division1);
            //System.out.println(division1);
            memBar.setVisible(true);
            memBar.setStringPainted(true);
            
            //double usedMemoryGB = ((double)(((usedMemory / 1024 )/ 1024) / 1024));
            double usedMemoryGB = (double)usedMemory / 1073741824;
            
            
            String usedformatted = df.format(usedMemoryGB);
            String totalformatted = df.format((double)osi.getTotalPhysicalMemorySize() / 1073741824);
            
            usedMemLabel.setText("Using: " +usedformatted+ " GB");
            totalMemLabel.setText("Out of: "+totalformatted+ " GB total memory.");
            
            window.setVisible(true);
            window.repaint();
            
            }
        });
        /*
        //cpu button
        cpuButton.addActionListener(new ActionListener(){
            
        @Override public void actionPerformed(ActionEvent arg0) {
            flag=0;
            cpuBar.setValue((int)(osi.getSystemCpuLoad() * 100));
            cpuBar.setVisible(true);
            cpuBar.setStringPainted(true);
            cpuLabel.setVisible(true);
            cpuLabel.setText("CPU Usage Percentage");
            window.setVisible(true);
            window.repaint();
            t.start();
            
            }
        }
        );
        
        diskButton.addActionListener(new ActionListener(){
            
        @Override public void actionPerformed(ActionEvent arg0) {
            flag=0;
            
            DecimalFormat df = new DecimalFormat("#.##");
            
            
            long diskSize = new File("/").getTotalSpace();
            long diskFree = new File("/").getFreeSpace();
            long diskUsable = new File("/").getUsableSpace();
            long diskUsed = diskSize - diskFree;
            double division = ((double)diskUsed / diskFree)*100; 
            System.out.println(division);
            cpuBar.setValue((int)division);
            cpuBar.setVisible(true);
            cpuBar.setStringPainted(true);
            cpuLabel.setVisible(true);
            cpuLabel.setText("Hard Disk Space Used: ");
            window.setVisible(true);
            double gbUsed = (double)diskUsed / 1073741824;
            double gbTotal = (double)diskSize / 1073741824;
            String formatted = df.format(gbUsed);
            String formatted2 = df.format((double)gbTotal);
            //upInfo.setText("Space Used: "+formatted+ " GB.");
            //downInfo.setText("Out of a total: " +formatted2+ " GB.");
            //upInfo.setVisible(true);
            //downInfo.setVisible(true);
            window.repaint();
            
            }
        }
        );
        
        //Memory BUTTON
        memoryButton.addActionListener(new ActionListener(){
        @Override public void actionPerformed(ActionEvent arg0){
            
            long usedMemory = osi.getTotalPhysicalMemorySize() - osi.getFreePhysicalMemorySize();
            double division = ((double) usedMemory/osi.getTotalPhysicalMemorySize()) *100;
            flag = 1;
            
            cpuBar.setValue((int)division);
            System.out.println(division);
            cpuBar.setVisible(true);
            cpuBar.setStringPainted(true);
            cpuLabel.setVisible(true);
            cpuLabel.setText("Memory Usage");
            window.setVisible(true);
            window.repaint();
            
            
            //MULTITHREADING IS REQUIRED FOR THIS TASK
            
            try {
            Thread.sleep(2000);                 
            } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();}
            }
        }
        );
*/
        
      
    }
     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
    }
    
    public static void main(String[] args) {
        OperatingSystemMXBean operatingSystemMXBean = (com.sun.management.OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean();
       //TESTING
       /*
       long diskSize = new File("/").getTotalSpace();
       long diskFree = new File("/").getFreeSpace();
       long diskUsable = new File("/").getUsableSpace();
       System.out.println("getCpuProcessTime()" + " = " + operatingSystemMXBean.getProcessCpuTime());
       //RAM USAGE in bytes
       System.out.println(" Total Physical Memory Size" + " = " + operatingSystemMXBean.getTotalPhysicalMemorySize());
       System.out.println(" Free Physical Memory Size" + " = " + operatingSystemMXBean.getFreePhysicalMemorySize());
       System.out.println("getProcessCpuLoad()" + " = " + operatingSystemMXBean.getProcessCpuLoad());
       
       System.out.println("Size of C:="+diskSize+" Bytes");
       System.out.println("Free space on C:="+diskFree+" Bytes");
       System.out.println("Usable space on C:="+diskUsable+" Bytes");
       */
       new pcBuddy();
       
         t.start();
       
       
    }
}
