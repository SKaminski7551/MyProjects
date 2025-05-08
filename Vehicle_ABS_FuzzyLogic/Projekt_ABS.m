R=0.315;%Promień koła
J=1.6;%Moment bezwładności koła
Mb=900;%Maksymalny moment hamujący
m=1200;%Masa całego pojazdu
g=9.81;
V0=40;%Początkowa prędkość pojazdu [m/s]

%Suchy asfalt
c11=1.2801;
c22=23.99;
c33=0.52;
c44=0.03;
%Mokry asfalt
c1=0.857;
c2=33.822;
c3=0.347;
c4=0.035;

Ts=0.01;
%Hydraulika
Lh=[100];
Mh=[0.01 1];
Gh=tf(Lh,Mh)
Ghd=c2d(Gh,Ts,'zoh')


Kr=100;
Tosc=1.5;
Kp=0.6*Kr;
Ti=0.5*Tosc;
Td=0.125*Tosc;
Ki=1.2*Kr/Tosc;
Kd=0.075*Kr*Tosc;