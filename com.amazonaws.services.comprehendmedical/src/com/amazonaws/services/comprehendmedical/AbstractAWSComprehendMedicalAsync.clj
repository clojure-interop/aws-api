(ns com.amazonaws.services.comprehendmedical.AbstractAWSComprehendMedicalAsync
  "Abstract implementation of AWSComprehendMedicalAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehendmedical AbstractAWSComprehendMedicalAsync]))

(defn detect-entities-async
  "Description copied from interface: AWSComprehendMedicalAsync

  request - `com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehendmedical.model.DetectEntitiesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSComprehendMedicalAsync this ^com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectEntitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSComprehendMedicalAsync this ^com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest request]
    (-> this (.detectEntitiesAsync request))))

(defn detect-phi-async
  "Description copied from interface: AWSComprehendMedicalAsync

  request - `com.amazonaws.services.comprehendmedical.model.DetectPHIRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectPHI operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehendmedical.model.DetectPHIResult>`"
  (^java.util.concurrent.Future [^AbstractAWSComprehendMedicalAsync this ^com.amazonaws.services.comprehendmedical.model.DetectPHIRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectPHIAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSComprehendMedicalAsync this ^com.amazonaws.services.comprehendmedical.model.DetectPHIRequest request]
    (-> this (.detectPHIAsync request))))

