use SmartyParty;

ALTER TABLE question ADD CONSTRAINT unique_question UNIQUE(question);


INSERT INTO question(question, hint, answer, optionOne, optionTwo, optionThree, level, subject) VALUES
  ('What planet is known as the Red Planet?','Named after a Roman god of war','Mars','Venus','Jupiter','Saturn',1,'Science'),
  ('What is the capital of Japan?','One of the largest cities in the world','Tokyo','Kyoto','Osaka','Beijing',1,'Geography'),
  ('Which animal is famous for having a long neck?','Often seen eating leaves from tall trees','Giraffe','Elephant','Camel','Zebra',1,'Animals'),
  ('Who painted the Mona Lisa?','An inventor and artist from Italy','Da Vinci','Picasso','Van Gogh','Michelangelo',2,'Art'),
  ('What gas do plants absorb from the atmosphere?','Humans breathe out this gas','Carbon Dioxide','Oxygen','Nitrogen','Hydrogen',1,'Science'),
  ('How many continents are there on Earth?','More than five but less than eight','7','5','6','8',1,'Geography'),
  ('Which instrument has black and white keys?','Common in classical music','Piano','Guitar','Drums','Violin',1,'Music'),
  ('What is the largest ocean on Earth?','Borders Asia and the Americas','Pacific','Atlantic','Indian','Arctic',1,'Geography'),
  ('Which superhero is known as the Dark Knight?','Lives in Gotham City','Batman','Superman','Iron Man','Flash',1,'Movies'),
  ('What is the freezing point of water in Celsius?','A very round number','0','32','100','10',1,'Science'),
  ('Which country is famous for pizza and pasta?','Shaped like a boot','Italy','France','Spain','Greece',1,'Food'),
  ('Who wrote Romeo and Juliet?','A famous English playwright','Shakespeare','Hemingway','Twain','Dickens',2,'Literature'),
  ('What is the hardest natural substance?','Often used in jewelry','Diamond','Gold','Iron','Silver',1,'Science'),
  ('Which sport uses a racket and shuttlecock?','Played indoors or outdoors','Badminton','Tennis','Baseball','Golf',1,'Sports'),
  ('What is the main language spoken in Brazil?','Not Spanish','Portuguese','English','French','Italian',2,'Language'),
  ('Which animal is known for changing colors?','Often blends into surroundings','Chameleon','Octopus','Frog','Lizard',1,'Animals'),
  ('What is the tallest mammal?','Its neck is its signature feature','Giraffe','Horse','Elephant','Moose',1,'Animals'),
  ('Which planet has rings that are easy to see?','A gas giant','Saturn','Mars','Mercury','Earth',1,'Science'),
  ('Who was the first president of the United States?','Appears on the one dollar bill','Washington','Lincoln','Jefferson','Adams',2,'History'),
  ('What do bees make?','Sweet and golden','Honey','Wax','Milk','Syrup',1,'Nature'),
  ('Which bird is known for mimicking sounds?','Often kept as a pet','Parrot','Crow','Owl','Penguin',1,'Animals'),
  ('What is the square root of 64?','A single digit even number','8','6','7','9',1,'Math'),
  ('Which holiday is associated with pumpkins?','Celebrated in October','Halloween','Christmas','Easter','Thanksgiving',1,'Holiday'),
  ('Which planet is closest to the Sun?','The smallest planet','Mercury','Venus','Earth','Mars',1,'Science'),
  ('What is the currency of the United Kingdom?','Named after weight','Pound','Euro','Dollar','Yen',2,'Geography'),
  ('Which sea creature has eight arms?','Very intelligent ocean animal','Octopus','Squid','Crab','Lobster',1,'Animals'),
  ('What is the largest land animal?','Known for its trunk','Elephant','Rhino','Hippo','Giraffe',1,'Animals'),
  ('Who discovered gravity after seeing a falling apple?','Famous physicist','Newton','Einstein','Galileo','Tesla',2,'Science'),
  ('What color do you get when you mix blue and yellow?','A common grass color','Green','Purple','Orange','Brown',1,'Art'),
  ('Which continent is Egypt located in?','Home to the Sahara Desert','Africa','Asia','Europe','Australia',1,'Geography'),
  ('What is the name of Harry Potter''s owl?','A snowy companion','Hedwig','Crookshanks','Scabbers','Fawkes',2,'Movies'),
  ('Which sport is known as the beautiful game?','Played with a round ball','Soccer','Basketball','Baseball','Hockey',1,'Sports'),
  ('How many sides does a triangle have?','Less than four','3','4','5','6',1,'Math'),
  ('What is the fastest land animal?','Spotted big cat','Cheetah','Lion','Tiger','Leopard',1,'Animals'),
  ('Which country gifted the Statue of Liberty to the USA?','Known for the Eiffel Tower','France','Germany','Italy','Spain',2,'History'),
  ('What is the boiling point of water in Celsius?','A three digit number','100','50','90','120',1,'Science'),
  ('Which instrument is associated with pirates in cartoons?','Small portable keyboard instrument','Accordion','Trumpet','Cello','Flute',2,'Music'),
  ('Which animal is known as man''s best friend?','A loyal household pet','Dog','Cat','Rabbit','Hamster',1,'Animals'),
  ('What is the capital of Canada?','Not Toronto or Vancouver','Ottawa','Montreal','Toronto','Calgary',2,'Geography'),
  ('Which shape has four equal sides?','Looks like a box','Square','Triangle','Circle','Rectangle',1,'Math');


