import G8Keys._
import giter8.G8

giter8Settings

resolvers += Resolver.url("typesafe", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

G8Keys.g8TestBufferLog := false

scriptedLaunchOpts ++= sys.process.javaVmArguments.filter(
  a => Seq("-Xmx", "-Xms", "-XX", "-Dsbt.log.noformat").exists(a.startsWith)
)

//hack to resolve default value of 'package' property
(properties in g8 in Test) <<= (properties in g8 in Test).
  map(props => props.
    map(tuple => (tuple._1, G8.applyTemplate(tuple._2, props))))
