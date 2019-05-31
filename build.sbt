lazy val root = (project in file("."))
.dependsOn(subProject)
.aggregate(subProject)

lazy val subProject = (project in file("sub-project"))
.enablePlugins(CommonPlugin)

import CommonPlugin._
greeting := "Hello"
