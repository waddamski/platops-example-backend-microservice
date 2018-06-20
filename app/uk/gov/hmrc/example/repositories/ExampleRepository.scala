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

package uk.gov.hmrc.example.repositories

import javax.inject.Inject

import play.api.libs.json.Json
import play.modules.reactivemongo.ReactiveMongoComponent
import reactivemongo.bson.BSONObjectID
import uk.gov.hmrc.mongo.ReactiveRepository
import uk.gov.hmrc.mongo.json.ReactiveMongoFormats

import scala.concurrent.ExecutionContext

case class Address(line1: String, line2: String, postCode: String, town: String)

object Address {
  val mongoFormat = Json.format[Address]
}

class ExampleRepository @Inject()(reactiveMongoComponent: ReactiveMongoComponent)(implicit ec: ExecutionContext) extends ReactiveRepository[Address, BSONObjectID](
  collectionName = "reports",
  mongo          = reactiveMongoComponent.mongoConnector.db,
  domainFormat   = Address.mongoFormat,
  idFormat       = ReactiveMongoFormats.objectIdFormats
)
