-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2019 at 04:40 AM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `calendar`
--

-- --------------------------------------------------------

--
-- Table structure for table `acadamiccalander`
--

CREATE TABLE `acadamiccalander` (
  `id` int(11) NOT NULL,
  `title` varchar(250) NOT NULL,
  `start` varchar(500) NOT NULL,
  `end` varchar(500) NOT NULL,
  `universityID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `acadamiccalander`
--

INSERT INTO `acadamiccalander` (`id`, `title`, `start`, `end`, `universityID`) VALUES
(1, 'asdasdasdasdfasdf', '2019-06-01', '2019-06-01', 2),
(3, 'Sinhala & Tamil New Year Festival 2019444444444', '2019-06-02', '2019-06-22', 2),
(4, 'xxxxxxxxxxxxxxxxxxxxxxxxxx', '2019-06-03', '2019-06-06', 2);

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `id` int(10) NOT NULL,
  `comment` text NOT NULL,
  `postid` int(10) NOT NULL,
  `universityid` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customerdetail`
--

CREATE TABLE `customerdetail` (
  `id` int(11) NOT NULL,
  `first_name` varchar(200) NOT NULL,
  `last_name` varchar(300) NOT NULL,
  `file` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customerdetail`
--

INSERT INTO `customerdetail` (`id`, `first_name`, `last_name`, `file`) VALUES
(21, 'Kavinduxxxxxxxxxxxx', 'asdasd', 'C:/Users/Kavindu Theekshana/Documents/GitHub/UniFirst/web/dist/images\\Screenshot (3).png'),
(22, 'Kavindu', 'xxxxxxxxxxxxxxx', 'C:/Users/Kavindu Theekshana/Documents/GitHub/UniFirst/web/dist/images\\Screenshot (19).png');

-- --------------------------------------------------------

--
-- Table structure for table `events`
--

CREATE TABLE `events` (
  `id` int(10) NOT NULL,
  `title` varchar(500) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  `time` varchar(100) DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  `venue` varchar(300) DEFAULT NULL,
  `description` text,
  `image` varchar(500) DEFAULT 'dist/images/event\\mock8.jpg',
  `special` varchar(500) DEFAULT NULL,
  `universityID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `events`
--

INSERT INTO `events` (`id`, `title`, `date`, `time`, `type`, `venue`, `description`, `image`, `special`, `universityID`) VALUES
(6, 'Colombo Python Meetup', '01/01/2018 - 01/01/2018', '09:00:00 - 14:00:00', 'Competitions', 'Colombo, Sri Lanka', 'This is a group anyone interested in python software development in any field such as Web Development, Data Processing and Data Science , Python and Cloud Computing, Python for Machine Learning and any one who love PEP 20 ', 'dist/images/event\\python-logo.png', NULL, 2),
(7, 'Sri Lanka Content Management Meetup', '05/17/2018 - 05/17/2018', '16:00:00 - 20:00:00', 'Meetups', 'Colombo, Sri Lanka', 'This is a meetup for anyone who is interested in Open source, cloud computing, semantic web, content management systems and search. The events organized by this group are FREE to attend.', 'dist/images/event\\How-to-make-a-Cloudflare-App_-Developer-Preview---May-11-2017---154721-3.jpg', NULL, 2),
(8, 'JAVA Colombovvcbcb', '05/08/2018 - 05/08/2018', '09:00:00 - 17:59:59', 'Meetups', 'Colombo, Sri Lanka', 'JAVA Colombo provides a warm and friendly atmosphere where Sri Lankan Java developers can meet each other and get to know each other better. We also have regular tech talks, panel discussions and various other educational activities to help developers learn and become experts in Java technologies. ', 'dist/images/event\\download.png', 'NSBM Green University', 31);

-- --------------------------------------------------------

--
-- Table structure for table `post`
--

CREATE TABLE `post` (
  `id` int(11) NOT NULL,
  `title` text,
  `image` varchar(500) DEFAULT NULL,
  `postbody` text,
  `universityID` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `post`
--

INSERT INTO `post` (`id`, `title`, `image`, `postbody`, `universityID`) VALUES
(16, 'Asian Universities Alliance (AUA) Summit 2019', 'dist/images\\aua_summit_2019_1.jpg', '<p>The third annual Asian Universities Alliance (AUA) Presidents Forum was successfully held in Hong Kong on 14 April 2019, hosted by The Hong Kong University of Science and Technology (HKUST). Comprising two sessions of panel discussions, this year&rsquo;s President Forum was attended by more than 150 guests, including students and faculty from HKUST and the Tsinghua-Berkley Shenzhen Institute.</p>\r\n<p>The Presidents Forum was attended by special guest of honor, the Chief Executive of the Hong Kong Special Administrative Region, Mrs. Carrie LAM CHENG Yuet-ngor. In her keynote address, Mrs. Lam outlined the unique role of Asia in the world&rsquo;s economy and highlighted the importance of universities in innovation and technological research, as well as in sustainable development. &ldquo;Your forum agenda, with sustainable development and technological entrepreneurship as central themes, is as ambitious and welcome as the AUA itself. The central question at hand is this: what can our post-secondary institutions bring to these complex challenges, these compelling opportunities? The answers will go a long way towards realising a flourishing and inclusive future for our universities, our economies, and the Asian region as a whole&rdquo;, said Mrs. Lam.</p>\r\n<p>HKUST President Wei Shyy and AUA &amp; Tsinghua University President QIU Yong also delivered an address during the Forum&rsquo;s opening ceremony. President Shyy welcomed guests to HKUST and commended the efforts of AUA as a regional Alliance. Drawing on the outcomes of the Board Meeting, held on 13 April, President Shyy said: &ldquo;I was very pleased to see the very substantial progress made on policy, sustainability, education outlook, student exchange, faculty, and even more important in my view, staff exchange. With that way we really have a viable dimension of the joined efforts.&rdquo; In his speech, President Qiu thanked HKUST for hosting the event. He talked about the achievements of AUA over the past two years, and reiterated the importance of the Presidents Forum, and the themes of this year&rsquo;s discussion. &ldquo;This time, the forum will focus on two major issues confronting the world today. The first one is sustainable development and the second one is innovation and entrepreneurship ecosystems. As globalization has made openness the trend of future higher education, we believe universities will play an increasingly important role in addressing the most pressing global challenges of human kind&rdquo;, said President Qiu.</p>\r\n<p>Keynote speakers Muhammad Anis, Rector, Universitas Indonesia, and QI Ye, Director, Institute for Public Policy, opened up session one of the Presidents Forum. Moderated by Christine Loh, Chief Development Strategist, Division of Environment and Sustainability, HKUST, session one was themed &lsquo;Roles of Universities in the Sustainability Agenda&rsquo;. Bundhit Eua-arporn, President, Chulalongkorn University; Ilesanmi Adesida, Provost, Nazarbayev University; Kamila Ghazali, Deputy Vice Chancellor, University of Malaya; Omar Kyaw, Pro Rector, University of Yangon; Sawako Shirahase, Executive Vice President, The University of Tokyo, participated in the panel discussion. Drawing from their unique perspectives, discussants highlighted their universities&rsquo; efforts in promoting sustainability as well as their contributions towards achieving the Sustainable Development Goals (SDGs). Referring to the contradiction between profit and green growth, panelists addressed questions from the audience, focusing on how to attract new graduates to work for sustainability, rather than profit.</p>\r\n<p>The second session, themed &lsquo;Innovation &amp; Entrepreneurship Ecosystems: Asian Perspectives on Technological Stewardship and Higher Education&rsquo;, was moderated by Professor Joseph Lee, Division of Public Policy, HKUST. Session two panelists, Abdullah Al-Salman, Vice Rector, King Saud University; Senior Professor&nbsp;<a href=\"http://www.res.cmb.ac.lk/demography/lakshman.dissanayake/\">Lakshman Dissanayake</a>, Former Vice Chancellor, University of Colombo; OH Se-Jung, President, Seoul National University; Andrew Wee, Vice President, National University of Singapore, were joined by the two afternoon keynote speakers, Devang Khakhar, Director, Indian Institute of Technology Bombay, and LI Zexiang, Professor, Department of Electronic and Computer Engineering, HKUST, for the panel discussion. Bringing diverse viewpoints to the session, panelists engaged in lively discussions on advances in government and university policies to be more innovative and less risk adverse. Touching on the attitude towards failure in some cultures, discussants talked about how this can hinder the growth of innovation and start up hubs. Before wrapping up the final session, all participants agreed that diverse Asian regions have a wealth of untapped potential to draw from, and that AUA can serve as a platform to foster deeper collaborations in innovation and technological research among member institutions.</p>\r\n<p>In closing the AUA Presidents Forum 2019, Sabrina Lin, Vice President for Institutional Advancement, HKUST, highlighted the strong link between the two session themes of sustainability, and innovation and entrepreneurship. Building upon the fruitful discussions of the day, she reiterated the value of AUA&rsquo;s diversity in providing varied perspectives and opportunities for pooling and sharing members&rsquo; strengths and resources. &ldquo;Making sure that the future environment is sustainable and in existence for our future generations requires a lot of innovation and entrepreneurship. This is a great opportunity for this very compact alliance, to encourage our students to exchange, to encourage our staff and our faculty to work together to address the world&rsquo;s challenges. In order for us to make both economic and social impact we need very diverse and different backgrounds to make the most resilient and successful teams&rdquo;, said Vice President Lin.</p>', 2),
(17, 'Sinhala & Tamil New Year Festival 2019', 'dist/images\\sarasavi_bakmaha_2019_28.jpg', '<p>University of Colombo celebrated the Sinhala &amp; Tamil New Year Festival 2019 at the University Ground premises on 30<sup>th</sup>&nbsp;of March 2019.&nbsp;<span class=\" _2iem\" role=\"heading\" aria-level=\"4\">Senior Professor&nbsp;<a href=\"http://www.res.cmb.ac.lk/demography/lakshman.dissanayake/\">Lakshman Dissanayake</a></span>, the Vice Chancellor presided over the event as the Chief Guest.</p>', 2);

-- --------------------------------------------------------

--
-- Table structure for table `problem`
--

CREATE TABLE `problem` (
  `id` int(10) NOT NULL,
  `title` varchar(500) NOT NULL,
  `description` text NOT NULL,
  `universityID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `problem`
--

INSERT INTO `problem` (`id`, `title`, `description`, `universityID`) VALUES
(2, 'Globalization causing extremely high competition', '<p>If your business is in the software industry and has a great idea, odds are another software company may have ready thought of it; if not, there may be no away to determine how close another company is to developing it. Time to market pressures is a stressful reality in the software industry. Competition can be local or international and impact software companies in terms of pricing structures, customer reach, customer retention, service level agreements and a host of other factors.</p>', 31),
(4, 'we want to create a automate payroll system.', '<p>lashda aldhal ksdkasl lajlda jldsl</p>', 31);

-- --------------------------------------------------------

--
-- Table structure for table `queries`
--

CREATE TABLE `queries` (
  `id` int(10) NOT NULL,
  `queries` text NOT NULL,
  `image` varchar(500) NOT NULL,
  `description` text NOT NULL,
  `universityID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `queries`
--

INSERT INTO `queries` (`id`, `queries`, `image`, `description`, `universityID`) VALUES
(5, 'asdasdas', 'dist/images/queries\\4.PNG', '<p>asssssssssssssssssssssss</p>', 22),
(9, 'Getting null pointer ', 'dist/images/queries\\markus-spiske-484245-unsplash.jpg', '<p>I\'m trying to run the tutorial from this page, but whenever I click on \"Product List\" or \"Login\" instead of getting the results from the database, I\'m getting a null pointer exception and I can\'t figure out why.<a href=\"https://o7planning.org/en/10285/create-a-simple-java-web-application-using-servlet-jsp-and-jdbc#a812054\" rel=\"nofollow noreferrer\">https://o7planning.org/en/10285/create-a-simple-java-web-application-using-servlet-jsp-and-jdbc#a812054</a></p>\r\n<p>I created the database, created the tables and was able to connect to it in eclipse, so I\'m pretty sure I\'ve got the connection details right.</p>\r\n<p>Database connected here:&nbsp;<a href=\"https://i.imgur.com/vltKmGa.png\" rel=\"nofollow noreferrer\">https://i.imgur.com/vltKmGa.png</a></p>\r\n<p>Tables created here:&nbsp;<a href=\"https://i.imgur.com/xDl5quv.png\" rel=\"nofollow noreferrer\">https://i.imgur.com/xDl5quv.png</a></p>\r\n<p>In the OracleConnUtils.java file I have substituted the following:</p>\r\n<pre class=\"default prettyprint prettyprinted\"><code>   <span class=\"typ\">String</span><span class=\"pln\"> hostName </span><span class=\"pun\">=</span> <span class=\"str\">\"localhost\"</span><span class=\"pun\">;</span>\r\n   <span class=\"typ\">String</span><span class=\"pln\"> sid </span><span class=\"pun\">=</span> <span class=\"str\">\"xe\"</span><span class=\"pun\">;</span>\r\n   <span class=\"typ\">String</span><span class=\"pln\"> userName </span><span class=\"pun\">=</span> <span class=\"str\">\"gpauser\"</span><span class=\"pun\">;</span>\r\n   <span class=\"typ\">String</span><span class=\"pln\"> password </span><span class=\"pun\">=</span> <span class=\"str\">\"\"</span><span class=\"pun\">;</span></code></pre>', 19),
(11, 'I have a simple dataframe, where I want to add a new column(col3) with values determined by the values from \'col1\'. If the value from \'col1\' starts with A, I want to put \'A\' to col3. And a similar thing to the value that starts with B.', 'dist/images/queries\\python-logo.png', '<p>import pandas as pd</p>\r\n<p>d = {\"col1\" : [\"A1\", \"A2\", \"B1\", \"B2\"], \"col2\" : [1, 2, 3, 4]}<br />df = pd.DataFrame(data = d)<br />df</p>', 19);

-- --------------------------------------------------------

--
-- Table structure for table `requestlecture`
--

CREATE TABLE `requestlecture` (
  `id` int(10) NOT NULL,
  `subject` varchar(500) NOT NULL,
  `date` varchar(100) NOT NULL,
  `time` varchar(100) NOT NULL,
  `venue` varchar(500) NOT NULL,
  `description` text NOT NULL,
  `universityID` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `requestlecture`
--

INSERT INTO `requestlecture` (`id`, `subject`, `date`, `time`, `venue`, `description`, `universityID`) VALUES
(4, 'Servers, Datacentres and Cloud ', '02/07/2018 - 02/07/2018', '08:00:00 - 10:00:00', 'NSBM Green University', 'We Need Special Lecture about Servers, Datacentres and Cloud \r\nif Anyone who Like To Support it Plase Inform to us\r\nContact:0112458965', 2);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `address` varchar(200) NOT NULL,
  `user_role` varchar(100) DEFAULT NULL,
  `universityID` int(11) DEFAULT NULL,
  `email` varchar(150) NOT NULL,
  `password` varchar(100) NOT NULL,
  `profilepic` varchar(500) NOT NULL DEFAULT 'dist\\images\\Profiles\\profile.jpg',
  `ststus` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `address`, `user_role`, `universityID`, `email`, `password`, `profilepic`, `ststus`) VALUES
(1, 'admin', 'Admin', 'Admin', NULL, 'admin@gmail.com', '333333', 'dist/images/Profiles\\31117733_1373650406068350_4458036509760552960_n.jpg', 1),
(2, 'University', 'University', 'University', NULL, 'university@gmail.com', '111111', 'dist/images/Profiles\\pTi68_7Y_400x400.jpg', 1),
(17, 'Student', 'Student', 'Student', 2, 'student@gmail.com', '333333', 'dist\\images\\Profiles\\profile.jpg', 1),
(31, 'Company', 'Company', 'Company', NULL, 'company@gmail.com', '222222', 'dist/images/Profiles\\GQ6Oa9If.jpg', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `acadamiccalander`
--
ALTER TABLE `acadamiccalander`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customerdetail`
--
ALTER TABLE `customerdetail`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `events`
--
ALTER TABLE `events`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `post`
--
ALTER TABLE `post`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `problem`
--
ALTER TABLE `problem`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `queries`
--
ALTER TABLE `queries`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `requestlecture`
--
ALTER TABLE `requestlecture`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `acadamiccalander`
--
ALTER TABLE `acadamiccalander`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `customerdetail`
--
ALTER TABLE `customerdetail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `events`
--
ALTER TABLE `events`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `post`
--
ALTER TABLE `post`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `problem`
--
ALTER TABLE `problem`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `queries`
--
ALTER TABLE `queries`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `requestlecture`
--
ALTER TABLE `requestlecture`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
