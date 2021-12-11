-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-12-2021 a las 02:26:06
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_datostxt`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `correos`
--

CREATE TABLE `correos` (
  `remitente` varchar(700) NOT NULL,
  `fecha` varchar(700) NOT NULL,
  `asunto` varchar(700) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `correos`
--

INSERT INTO `correos` (`remitente`, `fecha`, `asunto`) VALUES
('stephen.marquard@uct.ac.za', 'Sat Jan  5 09:14:16 2008', '[sakai] svn commit: r39771 - in bspace/site-manage/sakai_2-4-x/site-manage-tool/tool/src: bundle java/org/sakaiproject/site/tool'),
('louis@media.berkeley.edu', 'Fri Jan  4 18:10:48 2008', '[sakai] svn commit: r39770 - site-manage/branches/sakai_2-5-x/site-manage-tool/tool/src/webapp/vm/sitesetup'),
('zqian@umich.edu', 'Fri Jan  4 16:10:39 2008', '[sakai] svn commit: r39769 - in gradebook/trunk/app/ui/src: java/org/sakaiproject/tool/gradebook/ui/helpers/beans java/org/sakaiproject/tool/gradebook/ui/helpers/producers webapp/WEB-INF webapp/WEB-INF/bundle'),
('rjlowe@iupui.edu', 'Fri Jan  4 15:46:24 2008', '[sakai] svn commit: r39766 - site-manage/branches/sakai_2-4-x/site-manage-tool/tool/src/java/org/sakaiproject/site/tool'),
('zqian@umich.edu', 'Fri Jan  4 15:03:18 2008', '[sakai] svn commit: r39765 - in gradebook/trunk/app: business/src/java/org/sakaiproject/tool/gradebook/business business/src/java/org/sakaiproject/tool/gradebook/business/impl ui ui/src/java/org/sakaiproject/tool/gradebook/ui/helpers/beans ui/src/java/org/sakaiproject/tool/gradebook/ui/helpers/entity ui/src/java/org/sakaiproject/tool/gradebook/ui/helpers/params ui/src/java/org/sakaiproject/tool/gradebook/ui/helpers/producers ui/src/webapp/WEB-INF ui/src/webapp/WEB-INF/bundle ui/src/webapp/content/templates'),
('rjlowe@iupui.edu', 'Fri Jan  4 14:50:18 2008', '[sakai] svn commit: r39764 - in msgcntr/trunk/messageforums-app/src/java/org/sakaiproject/tool/messageforums: . ui'),
('cwen@iupui.edu', 'Fri Jan  4 11:37:30 2008', '[sakai] svn commit: r39763 - in msgcntr/trunk: messageforums-api/src/bundle/org/sakaiproject/api/app/messagecenter/bundle messageforums-app/src/java/org/sakaiproject/tool/messageforums'),
('cwen@iupui.edu', 'Fri Jan  4 11:35:08 2008', '[sakai] svn commit: r39762 - web/trunk/web-tool/tool/src/bundle'),
('gsilver@umich.edu', 'Fri Jan  4 11:12:37 2008', '[sakai] svn commit: r39761 - site/trunk/site-tool/tool/src/bundle'),
('gsilver@umich.edu', 'Fri Jan  4 11:11:52 2008', '[sakai] svn commit: r39760 - in site-manage/trunk/site-manage-tool/tool/src: java/org/sakaiproject/site/tool webapp/vm/sitesetup'),
('zqian@umich.edu', 'Fri Jan  4 11:11:03 2008', '[sakai] svn commit: r39759 - mailarchive/trunk/mailarchive-tool/tool/src/bundle'),
('gsilver@umich.edu', 'Fri Jan  4 11:10:22 2008', '[sakai] svn commit: r39758 - in gradebook/trunk: app/business/src/java/org/sakaiproject/tool/gradebook/business/impl service/api/src/java/org/sakaiproject/service/gradebook/shared service/impl/src/java/org/sakaiproject/component/gradebook'),
('wagnermr@iupui.edu', 'Fri Jan  4 10:38:42 2008', '[sakai] svn commit: r39757 - in assignment/trunk: assignment-impl/impl/src/java/org/sakaiproject/assignment/impl assignment-tool/tool/src/webapp/vm/assignment'),
('zqian@umich.edu', 'Fri Jan  4 10:17:42 2008', '[sakai] svn commit: r39756 - in component/branches/SAK-12166/component-api/component/src/java/org/sakaiproject/component: impl impl/spring/support impl/spring/support/dynamic impl/support util'),
('antranig@caret.cam.ac.uk', 'Fri Jan  4 10:04:14 2008', '[sakai] svn commit: r39755 - in sam/branches/SAK-12065: samigo-api/src/java/org/sakaiproject/tool/assessment/shared/api/grading samigo-app/src/java/org/sakaiproject/tool/assessment/ui/bean/evaluation samigo-app/src/java/org/sakaiproject/tool/assessment/ui/listener/evaluation samigo-services/src/java/org/sakaiproject/tool/assessment/facade samigo-services/src/java/org/sakaiproject/tool/assessment/integration/helper/ifc samigo-services/src/java/org/sakaiproject/tool/assessment/integration/helper/integrated samigo-services/src/java/org/sakaiproject/tool/assessment/integration/helper/standalone samigo-services/src/java/org/sakaiproject/tool/assessment/shared/impl/grading'),
('gopal.ramasammycook@gmail.com', 'Fri Jan  4 09:05:31 2008', '[sakai] svn commit: r39754 - in polls/branches/sakai_2-5-x: . tool tool/src/java/org/sakaiproject/poll/tool tool/src/java/org/sakaiproject/poll/tool/evolvers tool/src/webapp/WEB-INF'),
('david.horwitz@uct.ac.za', 'Fri Jan  4 07:02:32 2008', '[sakai] svn commit: r39753 - in polls/trunk: . tool tool/src/java/org/sakaiproject/poll/tool tool/src/java/org/sakaiproject/poll/tool/evolvers tool/src/webapp/WEB-INF'),
('david.horwitz@uct.ac.za', 'Fri Jan  4 06:08:27 2008', '[sakai] svn commit: r39752 - in podcasts/branches/sakai_2-5-x/podcasts-app/src/webapp: css podcasts'),
('david.horwitz@uct.ac.za', 'Fri Jan  4 04:49:08 2008', '[sakai] svn commit: r39751 - in podcasts/branches/sakai_2-5-x/podcasts-app/src/webapp: css images podcasts'),
('david.horwitz@uct.ac.za', 'Fri Jan  4 04:33:44 2008', '[sakai] svn commit: r39750 - event/branches/SAK-6216/event-util/util/src/java/org/sakaiproject/util'),
('stephen.marquard@uct.ac.za', 'Fri Jan  4 04:07:34 2008', '[sakai] svn commit: r39749 - in bspace/site-manage/sakai_2-4-x/site-manage-tool/tool/src: bundle webapp/vm/sitesetup'),
('louis@media.berkeley.edu', 'Thu Jan  3 19:51:20 2008', '[sakai] svn commit: r39746 - in bspace/site-manage/sakai_2-4-x/site-manage-tool/tool/src: bundle webapp/vm/sitesetup'),
('louis@media.berkeley.edu', 'Thu Jan  3 17:18:23 2008', '[sakai] svn commit: r39745 - providers/trunk/cm/cm-authz-provider/src/java/org/sakaiproject/coursemanagement/impl/provider'),
('ray@media.berkeley.edu', 'Thu Jan  3 17:07:00 2008', '[sakai] svn commit: r39744 - oncourse/branches/oncourse_OPC_122007'),
('cwen@iupui.edu', 'Thu Jan  3 16:34:40 2008', '[sakai] svn commit: r39743 - gradebook/branches/oncourse_2-4-2/app/ui/src/java/org/sakaiproject/tool/gradebook/ui'),
('cwen@iupui.edu', 'Thu Jan  3 16:29:07 2008', '[sakai] svn commit: r39742 - gradebook/branches/oncourse_2-4-2/app/ui/src/java/org/sakaiproject/tool/gradebook/ui');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
