(ns com.amazonaws.services.simpledb.AmazonSimpleDB
  "Interface for accessing Amazon SimpleDB.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonSimpleDB instead.


  Amazon SimpleDB is a web service providing the core database functions of data indexing and querying in the cloud. By
  offloading the time and effort associated with building and operating a web-scale database, SimpleDB provides
  developers the freedom to focus on application development.

  A traditional, clustered relational database requires a sizable upfront capital outlay, is complex to design, and
  often requires extensive and repetitive database administration. Amazon SimpleDB is dramatically simpler, requiring
  no schema, automatically indexing your data and providing a simple API for storage and access. This approach
  eliminates the administrative burden of data modeling, index maintenance, and performance tuning. Developers gain
  access to this functionality within Amazon's proven computing environment, are able to scale instantly, and pay only
  for what they use.


  Visit http://aws.amazon.com/simpledb/ for more information."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpledb AmazonSimpleDB]))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonSimpleDB this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn batch-put-attributes
  "The BatchPutAttributes operation creates or replaces attributes within one or more items. By using
   this operation, the client can perform multiple PutAttribute operation with a single call. This helps
   yield savings in round trips and latencies, enabling Amazon SimpleDB to optimize requests and generally produce
   better throughput.


   The client may specify the item name with the Item.X.ItemName parameter. The client may specify new
   attributes using a combination of the Item.X.Attribute.Y.Name and
   Item.X.Attribute.Y.Value parameters. The client may specify the first attribute for the first item
   using the parameters Item.0.Attribute.0.Name and Item.0.Attribute.0.Value, and for the
   second attribute for the first item by the parameters Item.0.Attribute.1.Name and
   Item.0.Attribute.1.Value, and so on.


   Attributes are uniquely identified within an item by their name/value combination. For example, a single item can
   have the attributes { \"first_name\", \"first_value\" } and
   { \"first_name\", \"second_value\" }. However, it cannot have two attribute instances where both the
   Item.X.Attribute.Y.Name and Item.X.Attribute.Y.Value are the same.


   Optionally, the requester can supply the Replace parameter for each individual value. Setting this
   value to true will cause the new attribute values to replace the existing attribute values. For
   example, if an item I has the attributes { 'a', '1' }, { 'b', '2'} and
   { 'b', '3' } and the requester does a BatchPutAttributes of {'I', 'b', '4' } with the
   Replace parameter set to true, the final attributes of the item will be { 'a', '1' } and
   { 'b', '4' }, replacing the previous values of the 'b' attribute with the new value.

    This operation is vulnerable to exceeding the maximum URL size when making a REST request using the
   HTTP GET method. This operation does not support conditions using Expected.X.Name,
   Expected.X.Value, or Expected.X.Exists.

   You can execute multiple BatchPutAttributes operations and other operations in parallel. However,
   large numbers of concurrent BatchPutAttributes calls can result in Service Unavailable (503)
   responses.


   The following limitations are enforced for this operation:

   256 attribute name-value pairs per item
   1 MB request size
   1 billion attributes per domain
   10 GB of total user data storage per domain
   25 item limit per BatchPutAttributes operation

  batch-put-attributes-request - `com.amazonaws.services.simpledb.model.BatchPutAttributesRequest`

  returns: Result of the BatchPutAttributes operation returned by the service. - `com.amazonaws.services.simpledb.model.BatchPutAttributesResult`

  throws: com.amazonaws.services.simpledb.model.NumberDomainAttributesExceededException - Too many attributes in this domain."
  (^com.amazonaws.services.simpledb.model.BatchPutAttributesResult [^AmazonSimpleDB this ^com.amazonaws.services.simpledb.model.BatchPutAttributesRequest batch-put-attributes-request]
    (-> this (.batchPutAttributes batch-put-attributes-request))))

(defn delete-domain
  "The DeleteDomain operation deletes a domain. Any items (and their attributes) in the domain are
   deleted as well. The DeleteDomain operation might take 10 or more seconds to complete.

  delete-domain-request - `com.amazonaws.services.simpledb.model.DeleteDomainRequest`

  returns: Result of the DeleteDomain operation returned by the service. - `com.amazonaws.services.simpledb.model.DeleteDomainResult`

  throws: com.amazonaws.services.simpledb.model.MissingParameterException - The request must contain the specified missing parameter."
  (^com.amazonaws.services.simpledb.model.DeleteDomainResult [^AmazonSimpleDB this ^com.amazonaws.services.simpledb.model.DeleteDomainRequest delete-domain-request]
    (-> this (.deleteDomain delete-domain-request))))

(defn domain-metadata
  "Returns information about the domain, including when the domain was created, the number of items and attributes
   in the domain, and the size of the attribute names and values.

  domain-metadata-request - `com.amazonaws.services.simpledb.model.DomainMetadataRequest`

  returns: Result of the DomainMetadata operation returned by the service. - `com.amazonaws.services.simpledb.model.DomainMetadataResult`

  throws: com.amazonaws.services.simpledb.model.MissingParameterException - The request must contain the specified missing parameter."
  (^com.amazonaws.services.simpledb.model.DomainMetadataResult [^AmazonSimpleDB this ^com.amazonaws.services.simpledb.model.DomainMetadataRequest domain-metadata-request]
    (-> this (.domainMetadata domain-metadata-request))))

(defn batch-delete-attributes
  "Performs multiple DeleteAttributes operations in a single call, which reduces round trips and latencies. This
   enables Amazon SimpleDB to optimize requests, which generally yields better throughput.


   The following limitations are enforced for this operation:

   1 MB request size
   25 item limit per BatchDeleteAttributes operation

  batch-delete-attributes-request - `com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest`

  returns: Result of the BatchDeleteAttributes operation returned by the service. - `com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult`"
  (^com.amazonaws.services.simpledb.model.BatchDeleteAttributesResult [^AmazonSimpleDB this ^com.amazonaws.services.simpledb.model.BatchDeleteAttributesRequest batch-delete-attributes-request]
    (-> this (.batchDeleteAttributes batch-delete-attributes-request))))

(defn create-domain
  "The CreateDomain operation creates a new domain. The domain name should be unique among the domains
   associated with the Access Key ID provided in the request. The CreateDomain operation may take 10 or
   more seconds to complete.


   The client can create up to 100 domains per account.


   If the client requires additional domains, go to
   http://aws.amazon.com/contact-us/simpledb-limit-request/.

  create-domain-request - `com.amazonaws.services.simpledb.model.CreateDomainRequest`

  returns: Result of the CreateDomain operation returned by the service. - `com.amazonaws.services.simpledb.model.CreateDomainResult`

  throws: com.amazonaws.services.simpledb.model.InvalidParameterValueException - The value for a parameter is invalid."
  (^com.amazonaws.services.simpledb.model.CreateDomainResult [^AmazonSimpleDB this ^com.amazonaws.services.simpledb.model.CreateDomainRequest create-domain-request]
    (-> this (.createDomain create-domain-request))))

(defn put-attributes
  "The PutAttributes operation creates or replaces attributes in an item. The client may specify new attributes
   using a combination of the Attribute.X.Name and Attribute.X.Value parameters. The
   client specifies the first attribute by the parameters Attribute.0.Name and
   Attribute.0.Value, the second attribute by the parameters Attribute.1.Name and
   Attribute.1.Value, and so on.


   Attributes are uniquely identified in an item by their name/value combination. For example, a single item can
   have the attributes { \"first_name\", \"first_value\" } and { \"first_name\", second_value\" }
   . However, it cannot have two attribute instances where both the Attribute.X.Name and
   Attribute.X.Value are the same.


   Optionally, the requestor can supply the Replace parameter for each individual attribute. Setting
   this value to true causes the new attribute value to replace the existing attribute value(s). For
   example, if an item has the attributes { 'a', '1' }, { 'b', '2'} and
   { 'b', '3' } and the requestor calls PutAttributes using the attributes
   { 'b', '4' } with the Replace parameter set to true, the final attributes of the item
   are changed to { 'a', '1' } and { 'b', '4' }, which replaces the previous values of the
   'b' attribute with the new value.


   You cannot specify an empty string as an attribute name.


   Because Amazon SimpleDB makes multiple copies of client data and uses an eventual consistency update model, an
   immediate GetAttributes or Select operation (read) immediately after a PutAttributes or
   DeleteAttributes operation (write) might not return the updated data.


   The following limitations are enforced for this operation:

   256 total attribute name-value pairs per item
   One billion attributes per domain
   10 GB of total user data storage per domain

  put-attributes-request - `com.amazonaws.services.simpledb.model.PutAttributesRequest`

  returns: Result of the PutAttributes operation returned by the service. - `com.amazonaws.services.simpledb.model.PutAttributesResult`

  throws: com.amazonaws.services.simpledb.model.InvalidParameterValueException - The value for a parameter is invalid."
  (^com.amazonaws.services.simpledb.model.PutAttributesResult [^AmazonSimpleDB this ^com.amazonaws.services.simpledb.model.PutAttributesRequest put-attributes-request]
    (-> this (.putAttributes put-attributes-request))))

(defn list-domains
  "The ListDomains operation lists all domains associated with the Access Key ID. It returns domain
   names up to the limit set by MaxNumberOfDomains. A NextToken is returned if there are more than MaxNumberOfDomains domains.
   Calling ListDomains successive times with the NextToken provided by the operation
   returns up to MaxNumberOfDomains more domain names with each successive operation call.

  list-domains-request - `com.amazonaws.services.simpledb.model.ListDomainsRequest`

  returns: Result of the ListDomains operation returned by the service. - `com.amazonaws.services.simpledb.model.ListDomainsResult`

  throws: com.amazonaws.services.simpledb.model.InvalidParameterValueException - The value for a parameter is invalid."
  (^com.amazonaws.services.simpledb.model.ListDomainsResult [^AmazonSimpleDB this ^com.amazonaws.services.simpledb.model.ListDomainsRequest list-domains-request]
    (-> this (.listDomains list-domains-request)))
  (^com.amazonaws.services.simpledb.model.ListDomainsResult [^AmazonSimpleDB this]
    (-> this (.listDomains))))

(defn select
  "The Select operation returns a set of attributes for ItemNames that match the select
   expression. Select is similar to the standard SQL SELECT statement.


   The total size of the response cannot exceed 1 MB in total size. Amazon SimpleDB automatically adjusts the number
   of items returned per page to enforce this limit. For example, if the client asks to retrieve 2500 items, but
   each individual item is 10 kB in size, the system returns 100 items and an appropriate NextToken so
   the client can access the next page of results.


   For information on how to construct select expressions, see Using Select to Create Amazon SimpleDB Queries in the
   Developer Guide.

  select-request - `com.amazonaws.services.simpledb.model.SelectRequest`

  returns: Result of the Select operation returned by the service. - `com.amazonaws.services.simpledb.model.SelectResult`

  throws: com.amazonaws.services.simpledb.model.InvalidNumberPredicatesException - Too many predicates exist in the query expression."
  (^com.amazonaws.services.simpledb.model.SelectResult [^AmazonSimpleDB this ^com.amazonaws.services.simpledb.model.SelectRequest select-request]
    (-> this (.select select-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"sdb.amazonaws.com\") or a full URL, including the protocol (ex: \"sdb.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonSimpleDB this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-attributes
  "Deletes one or more attributes associated with an item. If all attributes of the item are deleted, the item is
   deleted.


   DeleteAttributes is an idempotent operation; running it multiple times on the same item or attribute
   does not result in an error response.


   Because Amazon SimpleDB makes multiple copies of item data and uses an eventual consistency update model,
   performing a GetAttributes or Select operation (read) immediately after a
   DeleteAttributes or PutAttributes operation (write) might not return updated item data.

  delete-attributes-request - `com.amazonaws.services.simpledb.model.DeleteAttributesRequest`

  returns: Result of the DeleteAttributes operation returned by the service. - `com.amazonaws.services.simpledb.model.DeleteAttributesResult`

  throws: com.amazonaws.services.simpledb.model.InvalidParameterValueException - The value for a parameter is invalid."
  (^com.amazonaws.services.simpledb.model.DeleteAttributesResult [^AmazonSimpleDB this ^com.amazonaws.services.simpledb.model.DeleteAttributesRequest delete-attributes-request]
    (-> this (.deleteAttributes delete-attributes-request))))

(defn get-attributes
  "Returns all of the attributes associated with the specified item. Optionally, the attributes returned can be
   limited to one or more attributes by specifying an attribute name parameter.


   If the item does not exist on the replica that was accessed for this operation, an empty set is returned. The
   system does not return an error as it cannot guarantee the item does not exist on other replicas.

  get-attributes-request - `com.amazonaws.services.simpledb.model.GetAttributesRequest`

  returns: Result of the GetAttributes operation returned by the service. - `com.amazonaws.services.simpledb.model.GetAttributesResult`

  throws: com.amazonaws.services.simpledb.model.InvalidParameterValueException - The value for a parameter is invalid."
  (^com.amazonaws.services.simpledb.model.GetAttributesResult [^AmazonSimpleDB this ^com.amazonaws.services.simpledb.model.GetAttributesRequest get-attributes-request]
    (-> this (.getAttributes get-attributes-request))))

