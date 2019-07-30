(ns com.amazonaws.services.cloudhsm.AWSCloudHSMAsync
  "Interface for accessing CloudHSM asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCloudHSMAsync instead.


  AWS CloudHSM Service

  This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


  For information about the current version of AWS CloudHSM, see AWS
  CloudHSM, the AWS CloudHSM User Guide, and
  the AWS CloudHSM API Reference."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.cloudhsm AWSCloudHSMAsync]))

(defn modify-hapg-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Modifies an existing high-availability partition group.

  modify-hapg-request - `com.amazonaws.services.cloudhsm.model.ModifyHapgRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyHapg operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ModifyHapgResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ModifyHapgRequest modify-hapg-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyHapgAsync modify-hapg-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ModifyHapgRequest modify-hapg-request]
    (-> this (.modifyHapgAsync modify-hapg-request))))

(defn delete-hsm-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.

  delete-hsm-request - Contains the inputs for the DeleteHsm operation. - `com.amazonaws.services.cloudhsm.model.DeleteHsmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DeleteHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DeleteHsmRequest delete-hsm-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHsmAsync delete-hsm-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DeleteHsmRequest delete-hsm-request]
    (-> this (.deleteHsmAsync delete-hsm-request))))

(defn modify-luna-client-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Modifies the certificate used by the client.


   This action can potentially start a workflow to install the new certificate on the client's HSMs.

  modify-luna-client-request - `com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyLunaClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ModifyLunaClientResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest modify-luna-client-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyLunaClientAsync modify-luna-client-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ModifyLunaClientRequest modify-luna-client-request]
    (-> this (.modifyLunaClientAsync modify-luna-client-request))))

(defn list-hapgs-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Lists the high-availability partition groups for the account.


   This operation supports pagination with the use of the NextToken member. If more results are
   available, the NextToken member of the response contains a token that you pass in the next call to
   ListHapgs to retrieve the next set of items.

  list-hapgs-request - `com.amazonaws.services.cloudhsm.model.ListHapgsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHapgs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ListHapgsResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ListHapgsRequest list-hapgs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHapgsAsync list-hapgs-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ListHapgsRequest list-hapgs-request]
    (-> this (.listHapgsAsync list-hapgs-request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this]
    (-> this (.listHapgsAsync))))

(defn list-luna-clients-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Lists all of the clients.


   This operation supports pagination with the use of the NextToken member. If more results are
   available, the NextToken member of the response contains a token that you pass in the next call to
   ListLunaClients to retrieve the next set of items.

  list-luna-clients-request - `com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLunaClients operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ListLunaClientsResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest list-luna-clients-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLunaClientsAsync list-luna-clients-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ListLunaClientsRequest list-luna-clients-request]
    (-> this (.listLunaClientsAsync list-luna-clients-request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this]
    (-> this (.listLunaClientsAsync))))

(defn list-available-zones-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Lists the Availability Zones that have available AWS CloudHSM capacity.

  list-available-zones-request - Contains the inputs for the ListAvailableZones action. - `com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAvailableZones operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ListAvailableZonesResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest list-available-zones-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAvailableZonesAsync list-available-zones-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ListAvailableZonesRequest list-available-zones-request]
    (-> this (.listAvailableZonesAsync list-available-zones-request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this]
    (-> this (.listAvailableZonesAsync))))

(defn create-luna-client-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Creates an HSM client.

  create-luna-client-request - Contains the inputs for the CreateLunaClient action. - `com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLunaClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.CreateLunaClientResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest create-luna-client-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLunaClientAsync create-luna-client-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.CreateLunaClientRequest create-luna-client-request]
    (-> this (.createLunaClientAsync create-luna-client-request))))

(defn delete-hapg-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Deletes a high-availability partition group.

  delete-hapg-request - Contains the inputs for the DeleteHapg action. - `com.amazonaws.services.cloudhsm.model.DeleteHapgRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteHapg operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DeleteHapgResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DeleteHapgRequest delete-hapg-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteHapgAsync delete-hapg-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DeleteHapgRequest delete-hapg-request]
    (-> this (.deleteHapgAsync delete-hapg-request))))

(defn modify-hsm-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Modifies an HSM.



   This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is
   reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is
   configured for high availability, and consider executing this operation during a maintenance window.

  modify-hsm-request - Contains the inputs for the ModifyHsm operation. - `com.amazonaws.services.cloudhsm.model.ModifyHsmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ModifyHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ModifyHsmRequest modify-hsm-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyHsmAsync modify-hsm-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ModifyHsmRequest modify-hsm-request]
    (-> this (.modifyHsmAsync modify-hsm-request))))

(defn get-config-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Gets the configuration files necessary to connect to all high availability partition groups the client is
   associated with.

  get-config-request - `com.amazonaws.services.cloudhsm.model.GetConfigRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.GetConfigResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.GetConfigRequest get-config-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConfigAsync get-config-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.GetConfigRequest get-config-request]
    (-> this (.getConfigAsync get-config-request))))

(defn list-hsms-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves the identifiers of all of the HSMs provisioned for the current customer.


   This operation supports pagination with the use of the NextToken member. If more results are
   available, the NextToken member of the response contains a token that you pass in the next call to
   ListHsms to retrieve the next set of items.

  list-hsms-request - `com.amazonaws.services.cloudhsm.model.ListHsmsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHsms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ListHsmsResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ListHsmsRequest list-hsms-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHsmsAsync list-hsms-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ListHsmsRequest list-hsms-request]
    (-> this (.listHsmsAsync list-hsms-request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this]
    (-> this (.listHsmsAsync))))

(defn describe-hapg-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves information about a high-availability partition group.

  describe-hapg-request - Contains the inputs for the DescribeHapg action. - `com.amazonaws.services.cloudhsm.model.DescribeHapgRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHapg operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DescribeHapgResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DescribeHapgRequest describe-hapg-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHapgAsync describe-hapg-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DescribeHapgRequest describe-hapg-request]
    (-> this (.describeHapgAsync describe-hapg-request))))

(defn remove-tags-from-resource-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Removes one or more tags from the specified AWS CloudHSM resource.


   To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag,
   use AddTagsToResource.

  remove-tags-from-resource-request - `com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request))))

(defn list-tags-for-resource-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Returns a list of all tags for the specified AWS CloudHSM resource.

  list-tags-for-resource-request - `com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn describe-luna-client-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves information about an HSM client.

  describe-luna-client-request - `com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLunaClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DescribeLunaClientResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest describe-luna-client-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLunaClientAsync describe-luna-client-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DescribeLunaClientRequest describe-luna-client-request]
    (-> this (.describeLunaClientAsync describe-luna-client-request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this]
    (-> this (.describeLunaClientAsync))))

(defn delete-luna-client-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Deletes a client.

  delete-luna-client-request - `com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLunaClient operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DeleteLunaClientResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest delete-luna-client-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLunaClientAsync delete-luna-client-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DeleteLunaClientRequest delete-luna-client-request]
    (-> this (.deleteLunaClientAsync delete-luna-client-request))))

(defn add-tags-to-resource-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Adds or overwrites one or more tags for the specified AWS CloudHSM resource.


   Each tag consists of a key and a value. Tag keys must be unique to each resource.

  add-tags-to-resource-request - `com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest add-tags-to-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request))))

(defn create-hapg-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Creates a high-availability partition group. A high-availability partition group is a group of partitions that
   spans multiple physical HSMs.

  create-hapg-request - Contains the inputs for the CreateHapgRequest action. - `com.amazonaws.services.cloudhsm.model.CreateHapgRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHapg operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.CreateHapgResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.CreateHapgRequest create-hapg-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHapgAsync create-hapg-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.CreateHapgRequest create-hapg-request]
    (-> this (.createHapgAsync create-hapg-request))))

(defn create-hsm-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Creates an uninitialized HSM instance.


   There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation.
   If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm
   operation, go to the AWS Support Center, create a new
   case, and select Account and Billing Support.



   It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the
   DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING.

  create-hsm-request - Contains the inputs for the CreateHsm operation. - `com.amazonaws.services.cloudhsm.model.CreateHsmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.CreateHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.CreateHsmRequest create-hsm-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHsmAsync create-hsm-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.CreateHsmRequest create-hsm-request]
    (-> this (.createHsmAsync create-hsm-request))))

(defn describe-hsm-async
  "This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.


   For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference.


   Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.

  describe-hsm-request - Contains the inputs for the DescribeHsm operation. - `com.amazonaws.services.cloudhsm.model.DescribeHsmRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHsm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.cloudhsm.model.DescribeHsmResult>`"
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DescribeHsmRequest describe-hsm-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHsmAsync describe-hsm-request async-handler)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this ^com.amazonaws.services.cloudhsm.model.DescribeHsmRequest describe-hsm-request]
    (-> this (.describeHsmAsync describe-hsm-request)))
  (^java.util.concurrent.Future [^AWSCloudHSMAsync this]
    (-> this (.describeHsmAsync))))

