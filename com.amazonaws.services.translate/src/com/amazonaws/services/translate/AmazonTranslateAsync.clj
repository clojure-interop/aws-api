(ns com.amazonaws.services.translate.AmazonTranslateAsync
  "Interface for accessing Amazon Translate asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonTranslateAsync instead.



  Provides translation between one source language and another of the same set of languages."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.translate AmazonTranslateAsync]))

(defn delete-terminology-async
  "A synchronous action that deletes a custom terminology.

  delete-terminology-request - `com.amazonaws.services.translate.model.DeleteTerminologyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTerminology operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.DeleteTerminologyResult>`"
  (^java.util.concurrent.Future [^AmazonTranslateAsync this ^com.amazonaws.services.translate.model.DeleteTerminologyRequest delete-terminology-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTerminologyAsync delete-terminology-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranslateAsync this ^com.amazonaws.services.translate.model.DeleteTerminologyRequest delete-terminology-request]
    (-> this (.deleteTerminologyAsync delete-terminology-request))))

(defn get-terminology-async
  "Retrieves a custom terminology.

  get-terminology-request - `com.amazonaws.services.translate.model.GetTerminologyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTerminology operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.GetTerminologyResult>`"
  (^java.util.concurrent.Future [^AmazonTranslateAsync this ^com.amazonaws.services.translate.model.GetTerminologyRequest get-terminology-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTerminologyAsync get-terminology-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranslateAsync this ^com.amazonaws.services.translate.model.GetTerminologyRequest get-terminology-request]
    (-> this (.getTerminologyAsync get-terminology-request))))

(defn import-terminology-async
  "Creates or updates a custom terminology, depending on whether or not one already exists for the given terminology
   name. Importing a terminology with the same name as an existing one will merge the terminologies based on the
   chosen merge strategy. Currently, the only supported merge strategy is OVERWRITE, and so the imported terminology
   will overwrite an existing terminology of the same name.


   If you import a terminology that overwrites an existing one, the new terminology take up to 10 minutes to fully
   propagate and be available for use in a translation due to cache policies with the DataPlane service that
   performs the translations.

  import-terminology-request - `com.amazonaws.services.translate.model.ImportTerminologyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportTerminology operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.ImportTerminologyResult>`"
  (^java.util.concurrent.Future [^AmazonTranslateAsync this ^com.amazonaws.services.translate.model.ImportTerminologyRequest import-terminology-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importTerminologyAsync import-terminology-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranslateAsync this ^com.amazonaws.services.translate.model.ImportTerminologyRequest import-terminology-request]
    (-> this (.importTerminologyAsync import-terminology-request))))

(defn list-terminologies-async
  "Provides a list of custom terminologies associated with your account.

  list-terminologies-request - `com.amazonaws.services.translate.model.ListTerminologiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTerminologies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.ListTerminologiesResult>`"
  (^java.util.concurrent.Future [^AmazonTranslateAsync this ^com.amazonaws.services.translate.model.ListTerminologiesRequest list-terminologies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTerminologiesAsync list-terminologies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranslateAsync this ^com.amazonaws.services.translate.model.ListTerminologiesRequest list-terminologies-request]
    (-> this (.listTerminologiesAsync list-terminologies-request))))

(defn translate-text-async
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

  translate-text-request - `com.amazonaws.services.translate.model.TranslateTextRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TranslateText operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.translate.model.TranslateTextResult>`"
  (^java.util.concurrent.Future [^AmazonTranslateAsync this ^com.amazonaws.services.translate.model.TranslateTextRequest translate-text-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.translateTextAsync translate-text-request async-handler)))
  (^java.util.concurrent.Future [^AmazonTranslateAsync this ^com.amazonaws.services.translate.model.TranslateTextRequest translate-text-request]
    (-> this (.translateTextAsync translate-text-request))))

