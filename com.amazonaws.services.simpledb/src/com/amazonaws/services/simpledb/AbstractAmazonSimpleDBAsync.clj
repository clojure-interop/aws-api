(ns com.amazonaws.services.simpledb.AbstractAmazonSimpleDBAsync
  "Abstract implementation of AmazonSimpleDBAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpledb AbstractAmazonSimpleDBAsync]))

(defn domain-metadata-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.DomainMetadataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DomainMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.DomainMetadataResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.DomainMetadataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.domainMetadataAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.DomainMetadataRequest request]
    (-> this (.domainMetadataAsync request))))

(defn delete-domain-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.DeleteDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.DeleteDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.DeleteDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.DeleteDomainRequest request]
    (-> this (.deleteDomainAsync request))))

(defn select-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.SelectRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Select operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.SelectResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.SelectRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.selectAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.SelectRequest request]
    (-> this (.selectAsync request))))

(defn get-attributes-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.GetAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.GetAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.GetAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.GetAttributesRequest request]
    (-> this (.getAttributesAsync request))))

(defn create-domain-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.CreateDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.CreateDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.CreateDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.CreateDomainRequest request]
    (-> this (.createDomainAsync request))))

(defn put-attributes-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.PutAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.PutAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.PutAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.PutAttributesRequest request]
    (-> this (.putAttributesAsync request))))

(defn list-domains-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.ListDomainsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomains operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.ListDomainsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.ListDomainsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.ListDomainsRequest request]
    (-> this (.listDomainsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this]
    (-> this (.listDomainsAsync))))

(defn batch-put-attributes-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.BatchPutAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchPutAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.BatchPutAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.BatchPutAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchPutAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.BatchPutAttributesRequest request]
    (-> this (.batchPutAttributesAsync request))))

(defn delete-attributes-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.DeleteAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.DeleteAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.DeleteAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.DeleteAttributesRequest request]
    (-> this (.deleteAttributesAsync request))))

(defn batch-delete-attributes-async
  "Description copied from interface: AmazonSimpleDBAsync

  request - `com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSimpleDBAsync this ^com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest request]
    (-> this (.batchDeleteAttributesAsync request))))

