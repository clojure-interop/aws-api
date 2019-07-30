(ns com.amazonaws.services.resourcegroups.AWSResourceGroupsAsyncClient
  "Client for accessing Resource Groups asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS Resource Groups

  AWS Resource Groups lets you organize AWS resources such as Amazon EC2 instances, Amazon Relational Database Service
  databases, and Amazon S3 buckets into groups using criteria that you define as tags. A resource group is a collection
  of resources that match the resource types specified in a query, and share one or more tags or portions of tags. You
  can create a group of resources based on their roles in your cloud infrastructure, lifecycle stages, regions,
  application layers, or virtually any criteria. Resource groups enable you to automate management tasks, such as those
  in AWS Systems Manager Automation documents, on tag-related resources in AWS Systems Manager. Groups of tagged
  resources also let you quickly view a custom console in AWS Systems Manager that shows AWS Config compliance and
  other monitoring data about member resources.


  To create a resource group, build a resource query, and specify tags that identify the criteria that members of the
  group have in common. Tags are key-value pairs.


  For more information about Resource Groups, see the AWS Resource Groups User Guide.


  AWS Resource Groups uses a REST-compliant API that you can use to perform the following types of operations.




  Create, Read, Update, and Delete (CRUD) operations on resource groups and resource query entities




  Applying, editing, and removing tags from resource groups




  Resolving resource group member ARNs so they can be returned as search results




  Getting data about resources that are members of a group




  Searching AWS resources based on a resource query"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.resourcegroups AWSResourceGroupsAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.resourcegroups.AWSResourceGroupsAsyncClientBuilder`"
  (^com.amazonaws.services.resourcegroups.AWSResourceGroupsAsyncClientBuilder []
    (AWSResourceGroupsAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSResourceGroupsAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-group-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.CreateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.CreateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.CreateGroupRequest request]
    (-> this (.createGroupAsync request))))

(defn list-group-resources-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.ListGroupResourcesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.ListGroupResourcesRequest request]
    (-> this (.listGroupResourcesAsync request))))

(defn search-resources-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.SearchResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.SearchResourcesResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.SearchResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.SearchResourcesRequest request]
    (-> this (.searchResourcesAsync request))))

(defn get-group-query-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroupQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.GetGroupQueryResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupQueryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.GetGroupQueryRequest request]
    (-> this (.getGroupQueryAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSResourceGroupsAsyncClient this]
    (-> this (.shutdown))))

(defn update-group-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.UpdateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.UpdateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.UpdateGroupRequest request]
    (-> this (.updateGroupAsync request))))

(defn get-group-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.GetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.GetGroupResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.GetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.GetGroupRequest request]
    (-> this (.getGroupAsync request))))

(defn list-groups-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.ListGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.ListGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.ListGroupsRequest request]
    (-> this (.listGroupsAsync request))))

(defn delete-group-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.DeleteGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.DeleteGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.DeleteGroupRequest request]
    (-> this (.deleteGroupAsync request))))

(defn tag-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.TagRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Tag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.TagResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.TagRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.TagRequest request]
    (-> this (.tagAsync request))))

(defn update-group-query-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroupQuery operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.UpdateGroupQueryResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupQueryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.UpdateGroupQueryRequest request]
    (-> this (.updateGroupQueryAsync request))))

(defn untag-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.UntagRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Untag operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.UntagResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.UntagRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.UntagRequest request]
    (-> this (.untagAsync request))))

(defn get-tags-async
  "Description copied from interface: AWSResourceGroupsAsync

  request - `com.amazonaws.services.resourcegroups.model.GetTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroups.model.GetTagsResult>`"
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.GetTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSResourceGroupsAsyncClient this ^com.amazonaws.services.resourcegroups.model.GetTagsRequest request]
    (-> this (.getTagsAsync request))))

