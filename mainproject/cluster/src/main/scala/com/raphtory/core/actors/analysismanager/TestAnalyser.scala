package com.raphtory.core.actors.analysismanager

import com.raphtory.core.analysis.Analyser

class TestAnalyser extends Analyser {

  import akka.actor.ActorContext
  import com.raphtory.core.storage.controller.GraphRepoProxy

  override implicit var context: ActorContext = _
  override implicit var managerCount: Int = _

  override def analyse()(implicit proxy: GraphRepoProxy.type, managerCount: Int): Any = "hello"

  override def setup()(implicit proxy: GraphRepoProxy.type): Any = ""
}