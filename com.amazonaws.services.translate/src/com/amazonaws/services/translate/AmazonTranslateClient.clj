(ns com.amazonaws.services.translate.AmazonTranslateClient
  "Client for accessing Amazon Translate. All service calls made using this client are blocking, and will not return
  until the service call completes.


  Provides translation between one source language and another of the same set of languages."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.translate AmazonTranslateClient]))

(defn *builder
  "returns: `com.amazonaws.services.translate.AmazonTranslateClientBuilder`"
  (^com.amazonaws.services.translate.AmazonTranslateClientBuilder []
    (AmazonTranslateClient/builder )))

(defn delete-terminology
  "A synchronous action that deletes a custom terminology.

  request - `com.amazonaws.services.translate.model.DeleteTerminologyRequest`

  returns: Result of the DeleteTerminology operation returned by the service. - `com.amazonaws.services.translate.model.DeleteTerminologyResult`

  throws: com.amazonaws.services.translate.model.ResourceNotFoundException - The resource you are looking for has not been found. Review the resource you're looking for and see if a different resource will accomplish your needs before retrying the revised request. ."
  (^com.amazonaws.services.translate.model.DeleteTerminologyResult [^AmazonTranslateClient this ^com.amazonaws.services.translate.model.DeleteTerminologyRequest request]
    (-> this (.deleteTerminology request))))

(defn get-terminology
  "Retrieves a custom terminology.

  request - `com.amazonaws.services.translate.model.GetTerminologyRequest`

  returns: Result of the GetTerminology operation returned by the service. - `com.amazonaws.services.translate.model.GetTerminologyResult`

  throws: com.amazonaws.services.translate.model.ResourceNotFoundException - The resource you are looking for has not been found. Review the resource you're looking for and see if a different resource will accomplish your needs before retrying the revised request. ."
  (^com.amazonaws.services.translate.model.GetTerminologyResult [^AmazonTranslateClient this ^com.amazonaws.services.translate.model.GetTerminologyRequest request]
    (-> this (.getTerminology request))))

(defn import-terminology
  "Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology
   name. Importing a terminology with the same name as an existing one will merge the terminologies based on the
   chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology
   will overwrite an existing terminology of the same name.


   If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully
   propagate and be available for use in a translation due to cache policies with the DataPlane service that
   performs the translations.

  request - `com.amazonaws.services.translate.model.ImportTerminologyRequest`

  returns: Result of the ImportTerminology operation returned by the service. - `com.amazonaws.services.translate.model.ImportTerminologyResult`

  throws: com.amazonaws.services.translate.model.InvalidParameterValueException - The value of the parameter is invalid. Review the value of the parameter you are using to correct it, and then retry your operation."
  (^com.amazonaws.services.translate.model.ImportTerminologyResult [^AmazonTranslateClient this ^com.amazonaws.services.translate.model.ImportTerminologyRequest request]
    (-> this (.importTerminology request))))

(defn list-terminologies
  "Provides a list of custom terminologies associated with your account.

  request - `com.amazonaws.services.translate.model.ListTerminologiesRequest`

  returns: Result of the ListTerminologies operation returned by the service. - `com.amazonaws.services.translate.model.ListTerminologiesResult`

  throws: com.amazonaws.services.translate.model.InvalidParameterValueException - The value of the parameter is invalid. Review the value of the parameter you are using to correct it, and then retry your operation."
  (^com.amazonaws.services.translate.model.ListTerminologiesResult [^AmazonTranslateClient this ^com.amazonaws.services.translate.model.ListTerminologiesRequest request]
    (-> this (.listTerminologies request))))

(defn translate-text
  "Translates input text from the source language to the target language. It is not necessary to use English (en) as
   either the source or the target language but not all language combinations are supported by Amazon Translate. For
   more information, see Supported Language
   Pairs.




   Arabic (ar)




   Chinese (Simplified) (zh)




   Chinese (Traditional) (zh-TW)




   Czech (cs)




   Danish (da)




   Dutch (nl)




   English (en)




   Finnish (fi)




   French (fr)




   German (de)




   Hebrew (he)




   Indonesian (id)




   Italian (it)




   Japanese (ja)




   Korean (ko)




   Polish (pl)




   Portuguese (pt)




   Russian (ru)




   Spanish (es)




   Swedish (sv)




   Turkish (tr)




   To have Amazon Translate determine the source language of your text, you can specify auto in the
   SourceLanguageCode field. If you specify auto, Amazon Translate will call Amazon
   Comprehend to determine the source language.

  request - `com.amazonaws.services.translate.model.TranslateTextRequest`

  returns: Result of the TranslateText operation returned by the service. - `com.amazonaws.services.translate.model.TranslateTextResult`

  throws: com.amazonaws.services.translate.model.InvalidRequestException - The request that you made is invalid. Check your request to determine why it's invalid and then retry the request."
  (^com.amazonaws.services.translate.model.TranslateTextResult [^AmazonTranslateClient this ^com.amazonaws.services.translate.model.TranslateTextRequest request]
    (-> this (.translateText request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonTranslateClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

