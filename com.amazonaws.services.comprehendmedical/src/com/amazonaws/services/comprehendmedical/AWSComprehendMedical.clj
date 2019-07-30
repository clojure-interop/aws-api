(ns com.amazonaws.services.comprehendmedical.AWSComprehendMedical
  "Interface for accessing ComprehendMedical.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSComprehendMedical instead.



  Comprehend Medical extracts structured information from unstructured clinical text. Use these actions to gain insight
  in your documents."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.comprehendmedical AWSComprehendMedical]))

(defn detect-entities
  "Inspects the clinical text for a variety of medical entities and returns specific information about them such as
   entity category, location, and confidence score on that information .

  detect-entities-request - `com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest`

  returns: Result of the DetectEntities operation returned by the service. - `com.amazonaws.services.comprehendmedical.model.DetectEntitiesResult`

  throws: com.amazonaws.services.comprehendmedical.model.InternalServerException - An internal server error occurred. Retry your request."
  (^com.amazonaws.services.comprehendmedical.model.DetectEntitiesResult [^AWSComprehendMedical this ^com.amazonaws.services.comprehendmedical.model.DetectEntitiesRequest detect-entities-request]
    (-> this (.detectEntities detect-entities-request))))

(defn detect-phi
  "Inspects the clinical text for personal health information (PHI) entities and entity category, location, and
   confidence score on that information.

  detect-phi-request - `com.amazonaws.services.comprehendmedical.model.DetectPHIRequest`

  returns: Result of the DetectPHI operation returned by the service. - `com.amazonaws.services.comprehendmedical.model.DetectPHIResult`

  throws: com.amazonaws.services.comprehendmedical.model.InternalServerException - An internal server error occurred. Retry your request."
  (^com.amazonaws.services.comprehendmedical.model.DetectPHIResult [^AWSComprehendMedical this ^com.amazonaws.services.comprehendmedical.model.DetectPHIRequest detect-phi-request]
    (-> this (.detectPHI detect-phi-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSComprehendMedical this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSComprehendMedical this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

