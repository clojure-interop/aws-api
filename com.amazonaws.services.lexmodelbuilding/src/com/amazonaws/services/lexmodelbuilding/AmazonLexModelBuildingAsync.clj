(ns com.amazonaws.services.lexmodelbuilding.AmazonLexModelBuildingAsync
  "Interface for accessing Amazon Lex Model Building Service asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonLexModelBuildingAsync instead.


  Amazon Lex Build-Time Actions

  Amazon Lex is an AWS service for building conversational voice and text interfaces. Use these actions to create,
  update, and delete conversational bots for new and existing client applications."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lexmodelbuilding AmazonLexModelBuildingAsync]))

(defn get-bot-channel-associations-async
  "Returns a list of all of the channels associated with the specified bot.


   The GetBotChannelAssociations operation requires permissions for the
   lex:GetBotChannelAssociations action.

  get-bot-channel-associations-request - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBotChannelAssociations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest get-bot-channel-associations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotChannelAssociationsAsync get-bot-channel-associations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationsRequest get-bot-channel-associations-request]
    (-> this (.getBotChannelAssociationsAsync get-bot-channel-associations-request))))

(defn get-intents-async
  "Returns intent information as follows:




   If you specify the nameContains field, returns the $LATEST version of all intents that
   contain the specified string.




   If you don't specify the nameContains field, returns information about the $LATEST
   version of all intents.




   The operation requires permission for the lex:GetIntents action.

  get-intents-request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetIntentsResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest get-intents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntentsAsync get-intents-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentsRequest get-intents-request]
    (-> this (.getIntentsAsync get-intents-request))))

(defn get-export-async
  "Exports the contents of a Amazon Lex resource in a specified format.

  get-export-request - `com.amazonaws.services.lexmodelbuilding.model.GetExportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetExportResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetExportRequest get-export-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExportAsync get-export-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetExportRequest get-export-request]
    (-> this (.getExportAsync get-export-request))))

(defn put-bot-alias-async
  "Creates an alias for the specified version of the bot or replaces an alias for the specified bot. To change the
   version of the bot that the alias points to, replace the alias. For more information about aliases, see
   versioning-aliases.


   This operation requires permissions for the lex:PutBotAlias action.

  put-bot-alias-request - `com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutBotAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.PutBotAliasResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest put-bot-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putBotAliasAsync put-bot-alias-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutBotAliasRequest put-bot-alias-request]
    (-> this (.putBotAliasAsync put-bot-alias-request))))

(defn get-slot-types-async
  "Returns slot type information as follows:




   If you specify the nameContains field, returns the $LATEST version of all slot types
   that contain the specified string.




   If you don't specify the nameContains field, returns information about the $LATEST
   version of all slot types.




   The operation requires permission for the lex:GetSlotTypes action.

  get-slot-types-request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSlotTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest get-slot-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSlotTypesAsync get-slot-types-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypesRequest get-slot-types-request]
    (-> this (.getSlotTypesAsync get-slot-types-request))))

(defn create-bot-version-async
  "Creates a new version of the bot based on the $LATEST version. If the $LATEST version
   of this resource hasn't changed since you created the last version, Amazon Lex doesn't create a new version. It
   returns the last created version.



   You can update only the $LATEST version of the bot. You can't update the numbered versions that you
   create with the CreateBotVersion operation.



   When you create the first version of a bot, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
   For more information, see versioning-intro.


   This operation requires permission for the lex:CreateBotVersion action.

  create-bot-version-request - `com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateBotVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest create-bot-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createBotVersionAsync create-bot-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateBotVersionRequest create-bot-version-request]
    (-> this (.createBotVersionAsync create-bot-version-request))))

(defn delete-bot-channel-association-async
  "Deletes the association between an Amazon Lex bot and a messaging platform.


   This operation requires permission for the lex:DeleteBotChannelAssociation action.

  delete-bot-channel-association-request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBotChannelAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest delete-bot-channel-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBotChannelAssociationAsync delete-bot-channel-association-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotChannelAssociationRequest delete-bot-channel-association-request]
    (-> this (.deleteBotChannelAssociationAsync delete-bot-channel-association-request))))

(defn get-bot-versions-async
  "Gets information about all of the versions of a bot.


   The GetBotVersions operation returns a BotMetadata object for each version of a bot.
   For example, if a bot has three numbered versions, the GetBotVersions operation returns four
   BotMetadata objects in the response, one for each numbered version and one for the
   $LATEST version.


   The GetBotVersions operation always returns at least one version, the $LATEST version.


   This operation requires permissions for the lex:GetBotVersions action.

  get-bot-versions-request - `com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBotVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest get-bot-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotVersionsAsync get-bot-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotVersionsRequest get-bot-versions-request]
    (-> this (.getBotVersionsAsync get-bot-versions-request))))

(defn get-intent-versions-async
  "Gets information about all of the versions of an intent.


   The GetIntentVersions operation returns an IntentMetadata object for each version of an
   intent. For example, if an intent has three numbered versions, the GetIntentVersions operation
   returns four IntentMetadata objects in the response, one for each numbered version and one for the
   $LATEST version.


   The GetIntentVersions operation always returns at least one version, the $LATEST
   version.


   This operation requires permissions for the lex:GetIntentVersions action.

  get-intent-versions-request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntentVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest get-intent-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntentVersionsAsync get-intent-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentVersionsRequest get-intent-versions-request]
    (-> this (.getIntentVersionsAsync get-intent-versions-request))))

(defn get-builtin-slot-types-async
  "Gets a list of built-in slot types that meet the specified criteria.


   For a list of built-in slot types, see Slot Type Reference in the Alexa Skills Kit.


   This operation requires permission for the lex:GetBuiltInSlotTypes action.

  get-builtin-slot-types-request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBuiltinSlotTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest get-builtin-slot-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBuiltinSlotTypesAsync get-builtin-slot-types-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinSlotTypesRequest get-builtin-slot-types-request]
    (-> this (.getBuiltinSlotTypesAsync get-builtin-slot-types-request))))

(defn delete-bot-async
  "Deletes all versions of the bot, including the $LATEST version. To delete a specific version of the
   bot, use the DeleteBotVersion operation.


   If a bot has an alias, you can't delete it. Instead, the DeleteBot operation returns a
   ResourceInUseException exception that includes a reference to the alias that refers to the bot. To
   remove the reference to the bot, delete the alias. If you get the same exception again, delete the referring
   alias until the DeleteBot operation is successful.


   This operation requires permissions for the lex:DeleteBot action.

  delete-bot-request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteBotResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest delete-bot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBotAsync delete-bot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotRequest delete-bot-request]
    (-> this (.deleteBotAsync delete-bot-request))))

(defn put-intent-async
  "Creates an intent or replaces an existing intent.


   To define the interaction between the user and your bot, you use one or more intents. For a pizza ordering bot,
   for example, you would create an OrderPizza intent.


   To create an intent or replace an existing intent, you must provide the following:




   Intent name. For example, OrderPizza.




   Sample utterances. For example, \"Can I order a pizza, please.\" and \"I want to order a pizza.\"




   Information to be gathered. You specify slot types for the information that your bot will request from the user.
   You can specify standard slot types, such as a date or a time, or custom slot types such as the size and crust of
   a pizza.




   How the intent will be fulfilled. You can provide a Lambda function or configure the intent to return the intent
   information to the client application. If you use a Lambda function, when all of the intent information is
   available, Amazon Lex invokes your Lambda function. If you configure your intent to return the intent information
   to the client application.




   You can specify other optional information in the request, such as:




   A confirmation prompt to ask the user to confirm an intent. For example, \"Shall I order your pizza?\"




   A conclusion statement to send to the user after the intent has been fulfilled. For example,
   \"I placed your pizza order.\"




   A follow-up prompt that asks the user for additional activity. For example, asking
   \"Do you want to order a drink with your pizza?\"




   If you specify an existing intent name to update the intent, Amazon Lex replaces the values in the
   $LATEST version of the intent with the values in the request. Amazon Lex removes fields that you
   don't provide in the request. If you don't specify the required fields, Amazon Lex throws an exception. When you
   update the $LATEST version of an intent, the status field of any bot that uses the
   $LATEST version of the intent is set to NOT_BUILT.


   For more information, see how-it-works.


   This operation requires permissions for the lex:PutIntent action.

  put-intent-request - `com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutIntent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.PutIntentResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest put-intent-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putIntentAsync put-intent-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutIntentRequest put-intent-request]
    (-> this (.putIntentAsync put-intent-request))))

(defn delete-bot-alias-async
  "Deletes an alias for the specified bot.


   You can't delete an alias that is used in the association between a bot and a messaging channel. If an alias is
   used in a channel association, the DeleteBot operation returns a ResourceInUseException
   exception that includes a reference to the channel association that refers to the bot. You can remove the
   reference to the alias by deleting the channel association. If you get the same exception again, delete the
   referring association until the DeleteBotAlias operation is successful.

  delete-bot-alias-request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBotAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest delete-bot-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBotAliasAsync delete-bot-alias-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotAliasRequest delete-bot-alias-request]
    (-> this (.deleteBotAliasAsync delete-bot-alias-request))))

(defn delete-intent-async
  "Deletes all versions of the intent, including the $LATEST version. To delete a specific version of
   the intent, use the DeleteIntentVersion operation.


   You can delete a version of an intent only if it is not referenced. To delete an intent that is referred to in
   one or more bots (see how-it-works), you must remove those references first.



   If you get the ResourceInUseException exception, it provides an example reference that shows where
   the intent is referenced. To remove the reference to the intent, either update the bot or delete it. If you get
   the same exception when you attempt to delete the intent again, repeat until the intent has no references and the
   call to DeleteIntent is successful.



   This operation requires permission for the lex:DeleteIntent action.

  delete-intent-request - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteIntentResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest delete-intent-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntentAsync delete-intent-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentRequest delete-intent-request]
    (-> this (.deleteIntentAsync delete-intent-request))))

(defn put-bot-async
  "Creates an Amazon Lex conversational bot or replaces an existing bot. When you create or update a bot you are
   only required to specify a name, a locale, and whether the bot is directed toward children under age 13. You can
   use this to add intents later, or to remove intents from an existing bot. When you create a bot with the minimum
   information, the bot is created or updated but Amazon Lex returns the  response FAILED. You
   can build the bot after you add one or more intents. For more information about Amazon Lex bots, see
   how-it-works.


   If you specify the name of an existing bot, the fields in the request replace the existing values in the
   $LATEST version of the bot. Amazon Lex removes any fields that you don't provide values for in the
   request, except for the idleTTLInSeconds and privacySettings fields, which are set to
   their default values. If you don't specify values for required fields, Amazon Lex throws an exception.


   This operation requires permissions for the lex:PutBot action. For more information, see
   auth-and-access-control.

  put-bot-request - `com.amazonaws.services.lexmodelbuilding.model.PutBotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.PutBotResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutBotRequest put-bot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putBotAsync put-bot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutBotRequest put-bot-request]
    (-> this (.putBotAsync put-bot-request))))

(defn get-intent-async
  "Returns information about an intent. In addition to the intent name, you must specify the intent version.


   This operation requires permissions to perform the lex:GetIntent action.

  get-intent-request - `com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIntent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetIntentResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest get-intent-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIntentAsync get-intent-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetIntentRequest get-intent-request]
    (-> this (.getIntentAsync get-intent-request))))

(defn get-bots-async
  "Returns bot information as follows:




   If you provide the nameContains field, the response includes information for the
   $LATEST version of all bots whose name contains the specified string.




   If you don't specify the nameContains field, the operation returns information about the
   $LATEST version of all of your bots.




   This operation requires permission for the lex:GetBots action.

  get-bots-request - `com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotsResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest get-bots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotsAsync get-bots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotsRequest get-bots-request]
    (-> this (.getBotsAsync get-bots-request))))

(defn get-import-async
  "Gets information about an import job started with the StartImport operation.

  get-import-request - `com.amazonaws.services.lexmodelbuilding.model.GetImportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetImport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetImportResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetImportRequest get-import-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getImportAsync get-import-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetImportRequest get-import-request]
    (-> this (.getImportAsync get-import-request))))

(defn delete-intent-version-async
  "Deletes a specific version of an intent. To delete all versions of a intent, use the DeleteIntent
   operation.


   This operation requires permissions for the lex:DeleteIntentVersion action.

  delete-intent-version-request - `com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIntentVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest delete-intent-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIntentVersionAsync delete-intent-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteIntentVersionRequest delete-intent-version-request]
    (-> this (.deleteIntentVersionAsync delete-intent-version-request))))

(defn get-bot-aliases-async
  "Returns a list of aliases for a specified Amazon Lex bot.


   This operation requires permissions for the lex:GetBotAliases action.

  get-bot-aliases-request - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBotAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest get-bot-aliases-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotAliasesAsync get-bot-aliases-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasesRequest get-bot-aliases-request]
    (-> this (.getBotAliasesAsync get-bot-aliases-request))))

(defn get-slot-type-versions-async
  "Gets information about all versions of a slot type.


   The GetSlotTypeVersions operation returns a SlotTypeMetadata object for each version of
   a slot type. For example, if a slot type has three numbered versions, the GetSlotTypeVersions
   operation returns four SlotTypeMetadata objects in the response, one for each numbered version and
   one for the $LATEST version.


   The GetSlotTypeVersions operation always returns at least one version, the $LATEST
   version.


   This operation requires permissions for the lex:GetSlotTypeVersions action.

  get-slot-type-versions-request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSlotTypeVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest get-slot-type-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSlotTypeVersionsAsync get-slot-type-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeVersionsRequest get-slot-type-versions-request]
    (-> this (.getSlotTypeVersionsAsync get-slot-type-versions-request))))

(defn get-utterances-view-async
  "Use the GetUtterancesView operation to get information about the utterances that your users have
   made to your bot. You can use this list to tune the utterances that your bot responds to.


   For example, say that you have created a bot to order flowers. After your users have used your bot for a while,
   use the GetUtterancesView operation to see the requests that they have made and whether they have
   been successful. You might find that the utterance \"I want flowers\" is not being recognized. You could add this
   utterance to the OrderFlowers intent so that your bot recognizes that utterance.


   After you publish a new version of a bot, you can get information about the old version and the new so that you
   can compare the performance across the two versions.



   Utterance statistics are generated once a day. Data is available for the last 15 days. You can request
   information for up to 5 versions in each request. The response contains information about a maximum of 100
   utterances for each version.



   This operation requires permissions for the lex:GetUtterancesView action.

  get-utterances-view-request - `com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUtterancesView operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest get-utterances-view-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUtterancesViewAsync get-utterances-view-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetUtterancesViewRequest get-utterances-view-request]
    (-> this (.getUtterancesViewAsync get-utterances-view-request))))

(defn put-slot-type-async
  "Creates a custom slot type or replaces an existing custom slot type.


   To create a custom slot type, specify a name for the slot type and a set of enumeration values, which are the
   values that a slot of this type can assume. For more information, see how-it-works.


   If you specify the name of an existing slot type, the fields in the request replace the existing values in the
   $LATEST version of the slot type. Amazon Lex removes the fields that you don't provide in the
   request. If you don't specify required fields, Amazon Lex throws an exception. When you update the
   $LATEST version of a slot type, if a bot uses the $LATEST version of an intent that
   contains the slot type, the bot's status field is set to NOT_BUILT.


   This operation requires permissions for the lex:PutSlotType action.

  put-slot-type-request - `com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSlotType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest put-slot-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSlotTypeAsync put-slot-type-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.PutSlotTypeRequest put-slot-type-request]
    (-> this (.putSlotTypeAsync put-slot-type-request))))

(defn get-bot-async
  "Returns metadata information for a specific bot. You must provide the bot name and the bot version or alias.


   This operation requires permissions for the lex:GetBot action.

  get-bot-request - `com.amazonaws.services.lexmodelbuilding.model.GetBotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotRequest get-bot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotAsync get-bot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotRequest get-bot-request]
    (-> this (.getBotAsync get-bot-request))))

(defn start-import-async
  "Starts a job to import a resource to Amazon Lex.

  start-import-request - `com.amazonaws.services.lexmodelbuilding.model.StartImportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartImport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.StartImportResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.StartImportRequest start-import-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startImportAsync start-import-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.StartImportRequest start-import-request]
    (-> this (.startImportAsync start-import-request))))

(defn get-slot-type-async
  "Returns information about a specific version of a slot type. In addition to specifying the slot type name, you
   must specify the slot type version.


   This operation requires permissions for the lex:GetSlotType action.

  get-slot-type-request - `com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSlotType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest get-slot-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSlotTypeAsync get-slot-type-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetSlotTypeRequest get-slot-type-request]
    (-> this (.getSlotTypeAsync get-slot-type-request))))

(defn delete-bot-version-async
  "Deletes a specific version of a bot. To delete all versions of a bot, use the DeleteBot operation.


   This operation requires permissions for the lex:DeleteBotVersion action.

  delete-bot-version-request - `com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteBotVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest delete-bot-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteBotVersionAsync delete-bot-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteBotVersionRequest delete-bot-version-request]
    (-> this (.deleteBotVersionAsync delete-bot-version-request))))

(defn delete-slot-type-async
  "Deletes all versions of the slot type, including the $LATEST version. To delete a specific version
   of the slot type, use the DeleteSlotTypeVersion operation.


   You can delete a version of a slot type only if it is not referenced. To delete a slot type that is referred to
   in one or more intents, you must remove those references first.



   If you get the ResourceInUseException exception, the exception provides an example reference that
   shows the intent where the slot type is referenced. To remove the reference to the slot type, either update the
   intent or delete it. If you get the same exception when you attempt to delete the slot type again, repeat until
   the slot type has no references and the DeleteSlotType call is successful.



   This operation requires permission for the lex:DeleteSlotType action.

  delete-slot-type-request - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSlotType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest delete-slot-type-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSlotTypeAsync delete-slot-type-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeRequest delete-slot-type-request]
    (-> this (.deleteSlotTypeAsync delete-slot-type-request))))

(defn create-intent-version-async
  "Creates a new version of an intent based on the $LATEST version of the intent. If the
   $LATEST version of this intent hasn't changed since you last updated it, Amazon Lex doesn't create a
   new version. It returns the last version you created.



   You can update only the $LATEST version of the intent. You can't update the numbered versions that
   you create with the CreateIntentVersion operation.



   When you create a version of an intent, Amazon Lex sets the version to 1. Subsequent versions increment by 1. For
   more information, see versioning-intro.


   This operation requires permissions to perform the lex:CreateIntentVersion action.

  create-intent-version-request - `com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateIntentVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest create-intent-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createIntentVersionAsync create-intent-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateIntentVersionRequest create-intent-version-request]
    (-> this (.createIntentVersionAsync create-intent-version-request))))

(defn get-builtin-intent-async
  "Returns information about a built-in intent.


   This operation requires permission for the lex:GetBuiltinIntent action.

  get-builtin-intent-request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBuiltinIntent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest get-builtin-intent-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBuiltinIntentAsync get-builtin-intent-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentRequest get-builtin-intent-request]
    (-> this (.getBuiltinIntentAsync get-builtin-intent-request))))

(defn create-slot-type-version-async
  "Creates a new version of a slot type based on the $LATEST version of the specified slot type. If the
   $LATEST version of this resource has not changed since the last version that you created, Amazon Lex
   doesn't create a new version. It returns the last version that you created.



   You can update only the $LATEST version of a slot type. You can't update the numbered versions that
   you create with the CreateSlotTypeVersion operation.



   When you create a version of a slot type, Amazon Lex sets the version to 1. Subsequent versions increment by 1.
   For more information, see versioning-intro.


   This operation requires permissions for the lex:CreateSlotTypeVersion action.

  create-slot-type-version-request - `com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSlotTypeVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest create-slot-type-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSlotTypeVersionAsync create-slot-type-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.CreateSlotTypeVersionRequest create-slot-type-version-request]
    (-> this (.createSlotTypeVersionAsync create-slot-type-version-request))))

(defn delete-utterances-async
  "Deletes stored utterances.


   Amazon Lex stores the utterances that users send to your bot. Utterances are stored for 15 days for use with the
   GetUtterancesView operation, and then stored indefinitely for use in improving the ability of your bot to
   respond to user input.


   Use the DeleteStoredUtterances operation to manually delete stored utterances for a specific user.


   This operation requires permissions for the lex:DeleteUtterances action.

  delete-utterances-request - `com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUtterances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest delete-utterances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUtterancesAsync delete-utterances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteUtterancesRequest delete-utterances-request]
    (-> this (.deleteUtterancesAsync delete-utterances-request))))

(defn delete-slot-type-version-async
  "Deletes a specific version of a slot type. To delete all versions of a slot type, use the DeleteSlotType
   operation.


   This operation requires permissions for the lex:DeleteSlotTypeVersion action.

  delete-slot-type-version-request - `com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSlotTypeVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest delete-slot-type-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSlotTypeVersionAsync delete-slot-type-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.DeleteSlotTypeVersionRequest delete-slot-type-version-request]
    (-> this (.deleteSlotTypeVersionAsync delete-slot-type-version-request))))

(defn get-bot-channel-association-async
  "Returns information about the association between an Amazon Lex bot and a messaging platform.


   This operation requires permissions for the lex:GetBotChannelAssociation action.

  get-bot-channel-association-request - `com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBotChannelAssociation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest get-bot-channel-association-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotChannelAssociationAsync get-bot-channel-association-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotChannelAssociationRequest get-bot-channel-association-request]
    (-> this (.getBotChannelAssociationAsync get-bot-channel-association-request))))

(defn get-builtin-intents-async
  "Gets a list of built-in intents that meet the specified criteria.


   This operation requires permission for the lex:GetBuiltinIntents action.

  get-builtin-intents-request - `com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBuiltinIntents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest get-builtin-intents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBuiltinIntentsAsync get-builtin-intents-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBuiltinIntentsRequest get-builtin-intents-request]
    (-> this (.getBuiltinIntentsAsync get-builtin-intents-request))))

(defn get-bot-alias-async
  "Returns information about an Amazon Lex bot alias. For more information about aliases, see
   versioning-aliases.


   This operation requires permissions for the lex:GetBotAlias action.

  get-bot-alias-request - `com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBotAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexmodelbuilding.model.GetBotAliasResult>`"
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest get-bot-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBotAliasAsync get-bot-alias-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexModelBuildingAsync this ^com.amazonaws.services.lexmodelbuilding.model.GetBotAliasRequest get-bot-alias-request]
    (-> this (.getBotAliasAsync get-bot-alias-request))))

