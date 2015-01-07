package com.sample.remote

import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory

/**
 * Created by cloudera on 1/6/15.
 */
object SampleApp extends App{

  val system =
    ActorSystem("remotesys", ConfigFactory.load("remote.conf"))

  for(i <- 1 to 10){
    val actr = system.actorOf(Props[SampleActor],
      name = "creationActor"+i)
    println(akka.serialization.Serialization.serializedActorPath(actr))
  }
}
