(ns com.amazonaws.services.simpledb.AbstractAmazonSimpleDB
  "Abstract implementation of AmazonSimpleDB. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpledb AbstractAmazonSimpleDB]))

(defn set-region
  "Description copied from interface: AmazonSimpleDB

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonSimpleDB this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn batch-put-attributes
  "Description copied from interface: AmazonSimpleDB

  request - `com.amazonaws.services.simpledb.model.BatchPutAttributesRequest`

  returns: Result of the BatchPutAttributes operation returned by the service. - `com.amazonaws.services.simpledb.model.BatchPutAttributesResult`"
  (^com.amazonaws.services.simpledb.model.BatchPutAttributesResult [^AbstractAmazonSimpleDB this ^com.amazonaws.services.simpledb.model.BatchPutAttributesRequest request]
    (-> this (.batchPutAttributes request))))

(defn delete-domain
  "Description copied from interface: AmazonSimpleDB

  request - `com.amazonaws.services.simpledb.model.DeleteDomainRequest`

  returns: Result of the DeleteDomain operation returned by the service. - `com.amazonaws.services.simpledb.model.DeleteDomainResult`"
  (^com.amazonaws.services.simpledb.model.DeleteDomainResult [^AbstractAmazonSimpleDB this ^com.amazonaws.services.simpledb.model.DeleteDomainRequest request]
    (-> this (.deleteDomain request))))

(defn domain-metadata
  "Description copied from interface: AmazonSimpleDB

  request - `com.amazonaws.services.simpledb.model.DomainMetadataRequest`

  returns: Result of the DomainMetadata operation returned by the service. - `com.amazonaws.services.simpledb.model.DomainMetadataResult`"
  (^com.amazonaws.services.simpledb.model.DomainMetadataResult [^AbstractAmazonSimpleDB this ^com.amazonaws.services.simpledb.model.DomainMetadataRequest request]
    (-> this (.domainMetadata request))))

(defn batch-delete-attributes
  "Description copied from interface: AmazonSimpleDB

  request - `com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest`

  returns: Result of the BatchDeleteAttributes operation returned by the service. - `com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult`"
  (^com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult [^AbstractAmazonSimpleDB this ^com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest request]
    (-> this (.batchDeleteAttributes request))))

(defn create-domain
  "Description copied from interface: AmazonSimpleDB

  request - `com.amazonaws.services.simpledb.model.CreateDomainRequest`

  returns: Result of the CreateDomain operation returned by the service. - `com.amazonaws.services.simpledb.model.CreateDomainResult`"
  (^com.amazonaws.services.simpledb.model.CreateDomainResult [^AbstractAmazonSimpleDB this ^com.amazonaws.services.simpledb.model.CreateDomainRequest request]
    (-> this (.createDomain request))))

(defn put-attributes
  "Description copied from interface: AmazonSimpleDB

  request - `com.amazonaws.services.simpledb.model.PutAttributesRequest`

  returns: Result of the PutAttributes operation returned by the service. - `com.amazonaws.services.simpledb.model.PutAttributesResult`"
  (^com.amazonaws.services.simpledb.model.PutAttributesResult [^AbstractAmazonSimpleDB this ^com.amazonaws.services.simpledb.model.PutAttributesRequest request]
    (-> this (.putAttributes request))))

(defn list-domains
  "Description copied from interface: AmazonSimpleDB

  request - `com.amazonaws.services.simpledb.model.ListDomainsRequest`

  returns: Result of the ListDomains operation returned by the service. - `com.amazonaws.services.simpledb.model.ListDomainsResult`"
  (^com.amazonaws.services.simpledb.model.ListDomainsResult [^AbstractAmazonSimpleDB this ^com.amazonaws.services.simpledb.model.ListDomainsRequest request]
    (-> this (.listDomains request)))
  (^com.amazonaws.services.simpledb.model.ListDomainsResult [^AbstractAmazonSimpleDB this]
    (-> this (.listDomains))))

(defn select
  "Description copied from interface: AmazonSimpleDB

  request - `com.amazonaws.services.simpledb.model.SelectRequest`

  returns: Result of the Select operation returned by the service. - `com.amazonaws.services.simpledb.model.SelectResult`"
  (^com.amazonaws.services.simpledb.model.SelectResult [^AbstractAmazonSimpleDB this ^com.amazonaws.services.simpledb.model.SelectRequest request]
    (-> this (.select request))))

(defn set-endpoint
  "Description copied from interface: AmazonSimpleDB

  endpoint - The endpoint (ex: \"sdb.amazonaws.com\") or a full URL, including the protocol (ex: \"sdb.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonSimpleDB this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-attributes
  "Description copied from interface: AmazonSimpleDB

  request - `com.amazonaws.services.simpledb.model.DeleteAttributesRequest`

  returns: Result of the DeleteAttributes operation returned by the service. - `com.amazonaws.services.simpledb.model.DeleteAttributesResult`"
  (^com.amazonaws.services.simpledb.model.DeleteAttributesResult [^AbstractAmazonSimpleDB this ^com.amazonaws.services.simpledb.model.DeleteAttributesRequest request]
    (-> this (.deleteAttributes request))))

(defn get-attributes
  "Description copied from interface: AmazonSimpleDB

  request - `com.amazonaws.services.simpledb.model.GetAttributesRequest`

  returns: Result of the GetAttributes operation returned by the service. - `com.amazonaws.services.simpledb.model.GetAttributesResult`"
  (^com.amazonaws.services.simpledb.model.GetAttributesResult [^AbstractAmazonSimpleDB this ^com.amazonaws.services.simpledb.model.GetAttributesRequest request]
    (-> this (.getAttributes request))))

