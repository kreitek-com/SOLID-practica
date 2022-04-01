package com.kreitek.files;

public class FileSystemItemFactory {

    public static FileSystemItem getNewFileSystemItem(FileSystemItemType type, FileSystemItem parent, String name) {
        if (type == FileSystemItemType.FILE) {
            return new File(parent, name);
        } else if (type == FileSystemItemType.DIRECTORY) {
            return new Directory(parent, name);
        }
        return null;
    }

    public static FileSystemItem getNewFileSystemItem(FileSystemItemType type, String name) {
        return FileSystemItemFactory.getNewFileSystemItem(type, null, name);
    }

}
