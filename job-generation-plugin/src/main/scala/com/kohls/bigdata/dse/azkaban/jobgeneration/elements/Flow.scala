package com.kohls.bigdata.dse.azkaban.jobgeneration.elements

import com.kohls.bigdata.dse.azkaban.jobgeneration.utils.Graph

/**
  *
  * @param name  Name of the flow
  * @param jobs  Sequence of [[Job]] in the flow
  * @param graph Graph of the List of [[Job]]
  */
case class Flow(name: String, jobs: Seq[Job], graph: Graph[String])