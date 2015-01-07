package com.sample.remote

import akka.actor.Actor

/**
 * Created by cloudera on 1/6/15.
 */
class SampleActor extends Actor {
  def receive = {
    case mssg => println(mssg)
  }
}


