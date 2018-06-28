/*
 * Copyright 2018 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//package uk.gov.hmrc.example.repositories
//
//import org.scalatest.{Matchers, WordSpec}
//import org.scalatest.concurrent.{IntegrationPatience, ScalaFutures}
//import play.modules.reactivemongo.ReactiveMongoComponent
//import uk.gov.hmrc.mongo.{MongoConnector, MongoSpecSupport}
//import scala.concurrent.ExecutionContext.Implicits.global
//
//class ExampleRepositorySpec
//    extends WordSpec
//    with Matchers
//    with MongoSpecSupport
//    with ScalaFutures
//    with IntegrationPatience {
//
//  private val reactiveMongoComponent: ReactiveMongoComponent =
//    new ReactiveMongoComponent {
//      override def mongoConnector: MongoConnector = mongoConnectorForTest
//    }
//
//  val repo = new ExampleRepository(reactiveMongoComponent)
//
//  "The example" should {
//    "be able to save an address to mongo and read it back" in {
//      val anAddress = Address("Flat 2", "Some Road", "AAAAAA", "London")
//
//      repo.insert(anAddress).futureValue.ok shouldBe true
//      repo.findAll().futureValue.head       shouldBe anAddress
//    }
//  }
//}
