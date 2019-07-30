(ns com.amazonaws.services.comprehendmedical.AWSComprehendMedicalAsync
  "Interface for accessing ComprehendMedical asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSComprehendMedicalAsync instead.



  Comprehend Medical extracts structured information from unstructured clinical text. Use these actions to gain insight
  in your documents."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehendmedical AWSComprehendMedicalAsync]))

(defn detect-entities-async
  "Inspects the clinical text for a variety of medical entities and returns specific information about them such as
   entity category, location, and confidence score on that information .

  detect-entities-request - `com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectEntities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehendmedical.model.DetectEntitiesResult>`"
  (^java.util.concurrent.Future [^AWSComprehendMedicalAsync this ^com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest detect-entities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectEntitiesAsync detect-entities-request async-handler)))
  (^java.util.concurrent.Future [^AWSComprehendMedicalAsync this ^com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest detect-entities-request]
    (-> this (.detectEntitiesAsync detect-entities-request))))

(defn detect-phi-async
  "Inspects the clinical text for personal health information (PHI) entities and entity category, location, and
   confidence score on that information.

  detect-phi-request - `com.amazonaws.services.comprehendmedical.model.DetectPHIRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectPHI operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.comprehendmedical.model.DetectPHIResult>`"
  (^java.util.concurrent.Future [^AWSComprehendMedicalAsync this ^com.amazonaws.services.comprehendmedical.model.DetectPHIRequest detect-phi-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectPHIAsync detect-phi-request async-handler)))
  (^java.util.concurrent.Future [^AWSComprehendMedicalAsync this ^com.amazonaws.services.comprehendmedical.model.DetectPHIRequest detect-phi-request]
    (-> this (.detectPHIAsync detect-phi-request))))

